package com.example.trade.dfdlparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class UtilTest {

    public static BufferedReader fileReader(String path) {
        BufferedReader bufferedReader = null;
        try {
            File f = new File(path);
            bufferedReader = new BufferedReader(new FileReader(f));
            System.out.println("Reading file using Buffered Reader");
        } catch (IOException e) {
            System.out.println(" ");
        }
        return bufferedReader;
    }

    public static void getFileReadr(List<String> value, String pathFile) throws IOException {
        String readLine = "";
        List<String> result = value;
        BufferedReader bufferedReader = fileReader(pathFile);
        while ((readLine = bufferedReader.readLine()) != null) {
            System.out.println(readLine);
            result.add(readLine);
        }
    }


    public static boolean isNumericRegex(String str) {
        if (str == null)
            return false;
        return str.matches("-?\\d+");
    }

    public static boolean isAlphanumericalRegex(String str) {
        if (str == null)
            return false;
        return str.matches("-?\\w+");
    }

    public static boolean isAllRegex(String str) {
        if (str == null)
            return false;
        return str.matches("-?.+");
    }


}
