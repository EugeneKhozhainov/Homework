package oop;

import org.junit.Test;

public class TestCar {

    @Test
    public void run(){
        Car car = new Car(0, 5.0, 50.0);
        car.printState();
        car.move(11000);
        car.printState();
    }
}
