package com.example.trade.dfdlparser.rlc;

import com.example.trade.dfdlparser.UtilTest;
import com.example.trade.exception.ParserCompileException;
import com.example.trade.tse.message.rlc.OpeningSummaryMessage;
import com.example.trade.tse.message.rlc.RLCMessage;
import com.example.trade.tse.parser.TSCMessageParser;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
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
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TSCMessageParser.class)
@FixMethodOrder(MethodSorters.JVM)
public class OpeningSummeryTest {


    @Autowired
    private TSCMessageParser tcsMessageParser;

    private org.slf4j.Logger log = LoggerFactory.getLogger(OpeningSummeryTest.class);

    private ArrayList<String> value = new ArrayList<>();
    private String pathFile;
    private String fileName = "openingSummeryResult";


    @Before
    public void openingSummeryObjectRead() {
        pathFile = new File("src/test/resources/log/" + fileName + ".log").getAbsolutePath();
        log.debug(" Find the path : {} ", pathFile);
    }

    @Test
    public void openingSummeryTest() throws Exception {
        RLCMessage message = null;
        BufferedWriter writer ;
        Path path = Paths.get(pathFile);
        writer = Files.newBufferedWriter(path);
        log.debug(" Read the file : {} ", pathFile);
        //todo check NPE
        File logFile = new File(TSCMessageParser.class.getClassLoader().getResource("log/rlc" + fileName + ".log").getFile());
        Stream<String> stream = Files.lines(logFile.toPath());
        for (Object s : stream.toArray()) {
            try {
                s = s.toString().substring(s.toString().indexOf("rlcText")).substring(10);
                message = tcsMessageParser.parseMessageRLC(s.toString());
                if (message.getMessageType().equals("32")) {
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
    public void openingSummeryLengthTest() throws IOException {
        RLCMessage message ;
        OpeningSummaryMessage openingSummary ;
        log.debug(" Test By Length ");
        UtilTest.getFileReadr(value, pathFile);

        for (int i = 0; i < 50; i++) {
            String s = value.get(i);
            message = tcsMessageParser.parseMessageRLC(s);
            openingSummary = message.getOpeningSummaryMessage();

            assertEquals(openingSummary.getFirstTradePriceOfTheTradingDay().getAmount().toString().length(), 13);
            assertEquals(openingSummary.getFirstTradePriceOfTheTradingDay().getDecimalPointLocator().length(), 1);

            assertEquals(openingSummary.getLastTradePriceOfTheTradingDay().getAmount().toString().length(), 13);
            assertEquals(openingSummary.getLastTradePriceOfTheTradingDay().getDecimalPointLocator().length(), 1);

            assertEquals(openingSummary.getHighestTradePriceOfTheTradingDay().getAmount().toString().length(), 13);
            assertEquals(openingSummary.getHighestTradePriceOfTheTradingDay().getDecimalPointLocator().length(), 1);

            assertEquals(openingSummary.getLowestTradePriceOfTheTradingDay().getAmount().toString().length(), 13);
            assertEquals(openingSummary.getLowestTradePriceOfTheTradingDay().getDecimalPointLocator().length(), 1);

            assertEquals(openingSummary.getTrendFlag().toString().length(), 2);
            assertEquals(openingSummary.getTotalTradedQuantityAtOpening().toString().length(), 12);
            assertEquals(openingSummary.getLastTradePrice().length(), 1);

            assertEquals(openingSummary.getFiller5().length(), 5);
            assertEquals(openingSummary.getSignOfPrice().length(), 1);

            assertEquals(openingSummary.getPercentageOfPrice().getAmount().toString().length(), 13);
            assertEquals(openingSummary.getPercentageOfPrice().getDecimalPointLocator().length(), 1);

            assertEquals(openingSummary.getFiller().length(), 26);
            log.debug(" Finish Read of line : {} ", i);
        }

    }

    @Test
    public void openingSummeryByValueTest() throws IOException {
        RLCMessage message ;
        OpeningSummaryMessage openingSummary ;
        System.out.println(" TEST -> By Length > ");
        UtilTest.getFileReadr(value, pathFile);

        for (int i = 0; i < 50; i++) {
            String s = value.get(i);
            message = tcsMessageParser.parseMessageRLC(s);
            openingSummary = message.getOpeningSummaryMessage();

            assertEquals(true, UtilTest.isNumericRegex(openingSummary.getFirstTradePriceOfTheTradingDay().getAmount().toString()));
            assertEquals(true, UtilTest.isAllRegex(openingSummary.getFirstTradePriceOfTheTradingDay().getDecimalPointLocator()));
            assertEquals(true, UtilTest.isNumericRegex(openingSummary.getLastTradePriceOfTheTradingDay().getAmount().toString()));
            assertEquals(true, UtilTest.isAllRegex(openingSummary.getLastTradePriceOfTheTradingDay().getDecimalPointLocator()));

            assertEquals(true, UtilTest.isNumericRegex(openingSummary.getHighestTradePriceOfTheTradingDay().getAmount().toString()));
            assertEquals(true, UtilTest.isAllRegex(openingSummary.getHighestTradePriceOfTheTradingDay().getDecimalPointLocator()));

            assertEquals(true, UtilTest.isNumericRegex(openingSummary.getLowestTradePriceOfTheTradingDay().getAmount().toString()));
            assertEquals(true, UtilTest.isAllRegex(openingSummary.getLowestTradePriceOfTheTradingDay().getDecimalPointLocator()));

            assertEquals(true, UtilTest.isNumericRegex(openingSummary.getTrendFlag().toString()));
            assertEquals(true, UtilTest.isNumericRegex(openingSummary.getTotalTradedQuantityAtOpening().toString()));

            assertEquals(true, UtilTest.isAllRegex(openingSummary.getLastTradePrice()));

            assertEquals(true, UtilTest.isAllRegex(openingSummary.getFiller5()));
            assertEquals(openingSummary.getSignOfPrice(), SignOfPrice.getByValue(openingSummary.getSignOfPrice()).getValue());


            assertEquals(true, UtilTest.isNumericRegex(openingSummary.getPercentageOfPrice().getAmount().toString()));
            assertEquals(true, UtilTest.isAllRegex(openingSummary.getPercentageOfPrice().getDecimalPointLocator()));

            assertEquals(true, UtilTest.isAllRegex(openingSummary.getFiller()));
        }

    }

}


enum SignOfPrice {
    POS("+"),
    NEG("-"),
    NON("0");

    private String value;

    SignOfPrice(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SignOfPrice getByValue(String value) {
        return Arrays.stream(SignOfPrice.values()).filter(e -> e.value.equals(value)).findFirst().get();
    }

}

