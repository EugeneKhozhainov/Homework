package io;

import java.io.*;
import java.util.*;

public class IO2 {
    public static void main(String[] args) throws IOException {
        String fileSave = "/Users/eugenekhozhainov/Documents/GitHub/Homeworkeugene/src/main/java/io/save2.txt";
        String fileSaveFinal = "/Users/eugenekhozhainov/Documents/GitHub/Homeworkeugene/src/main/java/io/savefinal.txt";
        Random random = new Random();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileSave, true));
        int counter = 0;
        while (counter < 50) {
            int n = random.nextInt(99);
            writer.write(String.valueOf(n) + " ");
            counter++;
        }
        writer.close();

        Scanner sc = new Scanner(new FileInputStream(fileSave));

        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNext()) {
            list.add(Integer.valueOf(sc.next()));
        }
        sc.close();

        Collections.sort(list);

        System.out.println(list);

        BufferedWriter writerFinal = new BufferedWriter(new FileWriter(fileSaveFinal, true));
        writerFinal.write("Sorted data: ");
        for(int i = 0; i < list.size(); i++){
            writerFinal.write(list.get(i) + " ");
            System.out.println(list.get(i) + " writed to file");
        }
        writerFinal.close();


    }
}
