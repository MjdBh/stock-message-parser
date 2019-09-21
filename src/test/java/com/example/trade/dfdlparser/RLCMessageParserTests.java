package com.example.trade.dfdlparser;

import com.example.trade.tse.message.sle.SLEMessage;
import com.example.trade.tse.parser.TSCMessageParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TSCMessageParser.class)
public class RLCMessageParserTests {


    @Autowired
    private TSCMessageParser tcsMessageParser;


    @Test
    public void parseMessageTest() throws IOException {

        File logFile = new File(TSCMessageParser.class.getClassLoader().getResource("log/test.log").getFile());
        try (Stream<String> stream = Files.lines(logFile.toPath())) {
            for (Object s : stream.toArray()){

                SLEMessage message = tcsMessageParser.parseMessageSLE(s.toString());
                System.out.println(message.getFunctionCode());

                }
        }

    }

}
