package com.example.trade.dfdlparser;

import com.example.trade.tse.parser.TSCMessageParser;
import com.example.trade.tse.message.rlc.ObjectFactory;
import com.example.trade.tse.message.rlc.RLCMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.util.ValidationEventCollector;
import java.io.File;

public class TestInput {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        ValidationEventCollector validationCollector = new JAXB2ValidationEventCollector();
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setEventHandler(validationCollector);
        RLCMessage rlcMessage=(RLCMessage) unmarshaller.unmarshal(new File(TSCMessageParser.class.getClassLoader().getResource("log/test2.xml").getFile()));
        System.out.println(rlcMessage);

        for(ValidationEvent event:validationCollector.getEvents())
        {
            String msg = event.getMessage();
            System.out.println(msg);
        }
    }
}
