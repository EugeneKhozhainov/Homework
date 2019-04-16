package exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
    @org.junit.Test
    public void name() {
        List<Double> list = new ArrayList<>();


    }

    public List<Double> readValues(Scanner scanner) throws InputMismatchException {
        List<Double> myList = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            if (scanner.hasNextDouble()) {
                myList.add(scanner.nextDouble());
            } else {
                throw new InputMismatchException("Invalid value");
            }
        return myList;
    }
}
