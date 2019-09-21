package com.example.trade.tse.parser;

/**
 * Created by Majid on 2/5/17.
 */


import java.io.*;
import java.net.URISyntaxException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import com.example.trade.util.ParserUtils;
import com.example.trade.exception.ParserCompileException;
import com.example.trade.tse.message.rlc.ObjectFactory;
import com.example.trade.tse.message.rlc.RLCMessage;

import org.jdom2.output.XMLOutputter;

import edu.illinois.ncsa.daffodil.japi.infoset.*;
import edu.illinois.ncsa.daffodil.japi.Compiler;
import edu.illinois.ncsa.daffodil.japi.Daffodil;
import edu.illinois.ncsa.daffodil.japi.DataProcessor;
import edu.illinois.ncsa.daffodil.japi.ParseResult;
import edu.illinois.ncsa.daffodil.japi.ProcessorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class TSCMessageParser {

    private static Logger log = LoggerFactory.getLogger(TSCMessageParser.class);

    private Compiler compiler = Daffodil.compiler();

    private ProcessorFactory processorFactoryRLC;

    private DataProcessor dataProcessorRLC;

    private static XMLOutputter xo = new XMLOutputter();
    private static JAXBContext jaxbContextRLC;

    static {
        try {
            jaxbContextRLC = JAXBContext.newInstance(ObjectFactory.class);
        } catch (JAXBException e) {
            log.error("Error on instantiate object factory.");
            throw new ParserCompileException(e);
        }
    }

    private ThreadLocal<Unmarshaller> unmarshallerRLC;

    private ThreadLocal<JDOMInfosetOutputter> outputter = ThreadLocal.withInitial(() -> (new JDOMInfosetOutputter()));


    public TSCMessageParser() {
        compiler.setValidateDFDLSchemas(true);


        try {
           processorFactoryRLC = compiler.compileSource(ParserUtils.getSchemaRLCFile().toURI());
        } catch (IOException  | URISyntaxException e) {
            log.error("error on loading schema file.",e);
            throw new ParserCompileException(e);
        }
       if (processorFactoryRLC.isError())
            ParserUtils.logDiagnostic(processorFactoryRLC.getDiagnostics(), "error on process factory rlc");



        dataProcessorRLC = processorFactoryRLC.onPath("/");

        if (dataProcessorRLC.isError())
            ParserUtils.logDiagnostic(dataProcessorRLC.getDiagnostics(), "error on data processor RLC ");

        unmarshallerRLC= ThreadLocal.withInitial(() -> {
            try {
                return jaxbContextRLC.createUnmarshaller();
            } catch (JAXBException e) {
                log.error("Error on unmarshal rlc.");
                throw new ParserCompileException(e);
            }
        });

    }

    /**
     *
     * @param message message for parse and convert to object
     * @return RLCMessage that converted if message has error throw runtime exception
     */

    public RLCMessage parseMessageRLC(String message) {

        if (StringUtils.isEmpty(message) || message.length() < 54) {
            log.error("message {} is not valid", message);
            throw new ParserCompileException("message length is not valid. ");
        }


        ReadableByteChannel inputChannel = Channels.newChannel(new ByteArrayInputStream(message.getBytes(ParserUtils.getUtf8Charset())));

        ParseResult parseResult = dataProcessorRLC.parse(inputChannel, outputter.get());

        if (parseResult.isError()) {
            log.error("this message cant parse. -> {}", message);
            ParserUtils.logDiagnostic(parseResult.getDiagnostics(), "Error on parse message");
        }

        ByteArrayInputStream inputStream = new ByteArrayInputStream(xo.outputString(outputter.get().getResult()).getBytes(ParserUtils.getUtf8Charset()));
        try {

            return (RLCMessage) unmarshallerRLC.get().unmarshal(inputStream);
        } catch (JAXBException ex) {
            log.error("Error on unmarshal.");
            throw new ParserCompileException(ex);
        }
    }

}

