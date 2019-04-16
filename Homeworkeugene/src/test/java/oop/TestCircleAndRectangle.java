package oop;

import org.junit.Test;

public class TestCircleAndRectangle {
    @Test
    public void run(){
        Point lowerLeft = new Point(5, 5);
        Point upperLeft = new Point(5, 10);
        Point upperRight = new Point(15, 10);
        Point lowerRight = new Point(15, 5);

        Point centre = new Point(5, 5);

        Rectangle rectangle = new Rectangle(lowerLeft, upperLeft, upperRight, lowerRight);
        System.out.println("Rectangle diagonal length is = " + rectangle.getDiagonalLength());

        Circle circle = new Circle(centre, 55);
        System.out.println("Circle length is = " + circle.getCircleLength());
    }
}
