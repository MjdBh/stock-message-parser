package com.example.trade.dfdlparser.rlc;

import com.example.trade.dfdlparser.UtilTest;
import com.example.trade.exception.ParserCompileException;
import com.example.trade.tse.message.entity.IUrg;
import com.example.trade.tse.message.entity.YCrl;
import com.example.trade.tse.message.entity.YDest;
import com.example.trade.tse.message.rlc.RLCMessage;
import com.example.trade.tse.message.rlc.TextMessage;
import com.example.trade.tse.parser.TSCMessageParser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TSCMessageParser.class)
public class TextMessageTest {

    @Autowired
    private TSCMessageParser tcsMessageParser;

    private org.slf4j.Logger log = LoggerFactory.getLogger(TextMessageTest.class);

    private ArrayList<String> value = new ArrayList<>();
    private String pathFile;
    private String fileName = "textMessageResult";


    @Before
    public void textMessageRead() {
        pathFile = new File("src/test/resources/log/" + fileName + ".log").getAbsolutePath();
        log.debug(" Find the path : {} ", pathFile);
    }


    @Test
    public void textMessageTest() throws IOException {
        RLCMessage message = null;
        BufferedWriter writer ;
        Path path = Paths.get(pathFile);
        writer = Files.newBufferedWriter(path);
        //todo check NPE
        File logFile = new File(TSCMessageParser.class.getClassLoader().getResource("log/" + fileName + ".log").getFile());
        Stream<String> stream = Files.lines(logFile.toPath());
        for (Object s : stream.toArray()) {

            try {
                s = s.toString().substring(s.toString().indexOf("rlcText")).substring(10);
                message = tcsMessageParser.parseMessageRLC(s.toString());

                if (message.getMessageType().equals("23")) {
                    writer.append(s.toString()).append("\n");
                }
            } catch (Exception e) {
                log.error(" We have exception on the parsing file : {} ", message);
                throw new ParserCompileException(e);
            } finally {
                try {
                    writer.flush();
                } catch (IOException ex) {
                    log.error(" We have io exception on the file : {} ", writer);
                }
            }
        }
    }


    @Test
    public void testByLineLength() throws IOException {
        RLCMessage message ;
        TextMessage textMessage ;
        UtilTest.getFileReadr(value, pathFile);
        log.debug(" Test By Length : ");

        for (int i = 0; i < 50; i++) {
            String s = value.get(i);
            message = tcsMessageParser.parseMessageRLC(s);
            textMessage = message.getTextMessage();

            assertEquals(textMessage.getTypeOfMarket().length(), 2);
            assertEquals(textMessage.getPriorityIndicator().value().length(), 1);
            assertEquals(textMessage.getNatureOfMessage().value().length(), 1);
            assertEquals(textMessage.getAddressType().value().length(), 2);
            assertEquals(textMessage.getMessageNumber().length(), 3);
            assertEquals(textMessage.getNumberOfMessagesInThisMessage().length(), 2);
            assertEquals(textMessage.getSequenceNumberOfMessageWithinThisMessage().length(), 2);
            assertEquals(textMessage.getMessageTitle().length(), 80);
            assertEquals(textMessage.getMessageText().length(), 854);
            log.debug(" Finish Read of line : {} ", i);
        }
    }

    @Test
    public void testByValue() throws IOException {
        RLCMessage message;
        TextMessage textMessage ;
        log.debug(" Test By Value : ");
        UtilTest.getFileReadr(value, pathFile);

        for (int i = 0; i < 50; i++) {
            String s = value.get(0);
            message = tcsMessageParser.parseMessageRLC(s);
            textMessage = message.getTextMessage();

            assertEquals(true, UtilTest.isNumericRegex(textMessage.getSequenceNumberOfMessageWithinThisMessage()));
            assertEquals(textMessage.getTypeOfMarket(), TypeOfMarket.valueOf(textMessage.getTypeOfMarket()).name());
            assertEquals(textMessage.getPriorityIndicator(), IUrg.valueOf(textMessage.getPriorityIndicator().name()));
            assertEquals(textMessage.getNatureOfMessage(), YCrl.valueOf(textMessage.getNatureOfMessage().name()));
            assertEquals(textMessage.getAddressType(), YDest.valueOf(textMessage.getAddressType().name()));
            assertEquals(true, UtilTest.isAlphanumericalRegex(textMessage.getMessageNumber()));
            assertEquals(true, UtilTest.isAlphanumericalRegex(textMessage.getNumberOfMessagesInThisMessage()));
            assertEquals(true, UtilTest.isAllRegex(textMessage.getMessageTitle()));
            assertEquals(true, UtilTest.isAllRegex(textMessage.getMessageText()));
            log.debug(" Finish Read of line : {} ", i);
        }

    }


    enum TypeOfMarket {
        AC,
        OB,
        ST
    }


}