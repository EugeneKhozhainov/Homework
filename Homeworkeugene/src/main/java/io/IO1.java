package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class IO1 {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> map = new HashMap<>();

        String fileName = "/Users/eugenekhozhainov/Documents/GitHub/Homeworkeugene/src/main/java/io/file.txt";
        String fileSave = "/Users/eugenekhozhainov/Documents/GitHub/Homeworkeugene/src/main/java/io/save.txt";
        InputStream is = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(is,
                StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        br.lines().forEach(line -> {
            String s = line.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                String s1 = s.substring(i, i + 1);
                Integer g = map.get(s1);
                if (g == null) {
                    map.put(s1, 1);
                } else {
                    map.put(s1, g + 1);
                }
            }
        });

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileSave, true));
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> pairs = it.next();
            writer.write(pairs.getKey() + " - " + pairs.getValue() + "\r\n");
        }
        writer.close();


    }
}
