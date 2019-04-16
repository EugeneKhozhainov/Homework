package oop;

import org.junit.Test;

public class TestA {

    @Test
    public void invoke(){
        Point p1 = new Point(15,15);
        Point p2 = new Point(25,25).translate(1, 15).scale(2);
        Double distance = p1.distance(p2);
        //System.out.println("Distance = " + distance);
        System.out.println(String.format("Distance = %s", distance));
        System.out.println(String.format("x = %s, y = %s", p2.getX(), p2.getY()));
    }
}
