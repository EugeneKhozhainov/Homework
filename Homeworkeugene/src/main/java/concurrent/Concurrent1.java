package concurrent;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Concurrent1 {
    public static void main(String[] args) {

        String fileInputFirst = "/Users/eugenekhozhainov/Documents/GitHub/Homeworkeugene/src/main/java/concurrent/resources/FileInputFirst.txt";
        String fileOutputFirst = "/Users/eugenekhozhainov/Documents/GitHub/Homeworkeugene/src/main/java/concurrent/resources/FileOutputFirst.txt";
        String fileInputSecond = "/Users/eugenekhozhainov/Documents/GitHub/Homeworkeugene/src/main/java/concurrent/resources/FileInputSecond.txt";
        String fileOutputSecond = "/Users/eugenekhozhainov/Documents/GitHub/Homeworkeugene/src/main/java/concurrent/resources/FileOutputSecond.txt";

        MyThread first = new MyThread(fileInputFirst, fileOutputFirst, "first");
        MyThread second = new MyThread(fileInputSecond, fileOutputSecond, "second");

        System.out.println("Initial priority for first thread is = " + first.getPriority());
        System.out.println("Initial priority for second thread is = " + second.getPriority());

        first.setPriority(1);
        second.setPriority(10);

        System.out.println("New priority for second thread is = " + first.getPriority());
        System.out.println("New priority for second thread is = " + second.getPriority());

        first.run();
        second.run();
        first.run();
        second.run();
        first.run();
        second.run();


    }

    static class MyThread extends Thread {
        final String fileInput;
        final String fileOutput;
        final String threadName;

        public MyThread(String fileInput, String fileOutput, String threadName) {
            this.fileInput = fileInput;
            this.fileOutput = fileOutput;
            this.threadName = threadName;
        }

        @Override
        public void run() {

            try {
                Scanner sc = new Scanner(new FileInputStream(fileInput));
                ArrayList<String> list = new ArrayList<>();
                while (sc.hasNext()) {
                    list.add(sc.next());
                }
                sc.close();

                BufferedWriter writerFinal = new BufferedWriter(new FileWriter(fileOutput, true));
                for (int i = 0; i < list.size(); i++) {
                    writerFinal.write(list.get(i) + " ");
                }
                writerFinal.close();

                System.out.println("Thread " + threadName + " executed successfully");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

