package com.example.trade.util;

import com.example.trade.exception.ParserCompileException;
import edu.illinois.ncsa.daffodil.japi.Diagnostic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ParserUtils {

    private static Logger log = LoggerFactory.getLogger(ParserUtils.class);

    private static String schemaRLCPath = "xsd/rlc/main.xsd";
    private static String schemaSLEPath = "xsd/sle/main.xsd";
    private static final String rlcMessageIdentifier = "rlcText";
    private static final Charset utf8Charset = StandardCharsets.UTF_8;


    private ParserUtils() {
    }

    public static URL getSchemaRLCFile() {

        return ParserUtils.class.getClassLoader().getResource(schemaRLCPath);
    }
    public static URL getSchemaSLEFile() {

        return ParserUtils.class.getClassLoader().getResource(schemaSLEPath);
    }

    public static void logDiagnostic(List<Diagnostic> diagnostics, String message) {
        log.error(message);
        for (Diagnostic diagnostic : diagnostics) {
            log.error(diagnostic.getSomeMessage());
        }
        throw new ParserCompileException(message);
    }

    public static String getSchemaRLCPath() {
        return schemaRLCPath;
    }

    public static String getSchemaSLEPath() {
        return schemaSLEPath;
    }


    public static String getRlcMessageIdentifier() {
        return rlcMessageIdentifier;
    }

    public static Charset getUtf8Charset() {
        return utf8Charset;
    }


    public static <T extends Amountable> float getAmount(T input) {
        float result = input.getAmount().floatValue();
        int decimalLocator = Integer.valueOf(input.getDecimalPointLocator());
        if (decimalLocator != 0) {
            result = ((float) (result / (Math.pow(10, decimalLocator))));
        }
        return result;
    }


    public static <T extends Amountable> boolean isValidAmount(T input) {
        if (input==null ||
            input.getAmount()==null ||
            StringUtils.isEmpty(input.getDecimalPointLocator()) ||
            StringUtils.isEmpty(input.getDecimalPointLocator().trim()) ||
            StringUtils.containsWhitespace(input.getDecimalPointLocator()) ||
            !org.apache.commons.lang.StringUtils.isNumeric(input.getDecimalPointLocator())||
            BigInteger.ZERO.equals(input.getAmount())    ) {

            return false;
        }


        return true;
    }
}
