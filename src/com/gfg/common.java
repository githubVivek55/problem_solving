package com.gfg;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class common {
    static String filePath = System.getProperty("user.dir")+"/files/fileInput2.txt";
    public static void main(String[] args) throws IOException {
        NumberFormat japanLocal = NumberFormat.getCompactNumberInstance(Locale.JAPAN, NumberFormat.Style.SHORT);
        System.out.println(japanLocal.format(120000));

        Path path = Paths.get(filePath);
        String content = Files.readString(path);

        System.out.println(content);

        List<String> strings = Files.readAllLines(path);
        strings.forEach(System.out::println);

        BufferedReader bufferedReader = Files.newBufferedReader(path);
        bufferedReader.lines().forEach(System.out::println);
        newSwitch();
    }

    public static void newSwitch(){
        int num =2;
        String res = switch (num){
            case 1,2,3,4,5 -> "weekdays";
            case 6,7 -> "WeekEnd";
            default -> "Invalid number";
        };

        System.out.println(res);
    }
}
