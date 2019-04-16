package exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Double> list = readValues(input);
        System.out.println(list);
        System.out.println(sumOfValues(list));
    }

    public static List<Double> readValues(Scanner scanner) throws InputMismatchException {
        List<Double> myList = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            if (scanner.hasNextDouble()) {
                myList.add(scanner.nextDouble());
            } else {
                throw new InputMismatchException("Invalid value");
            }
        return myList;
    }

    public static Double sumOfValues(List<Double> list) {
        Double sum = 0.0;
        for (Double d : list) {
            sum = sum + d;
        }

        return sum;
    }
}



