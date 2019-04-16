package oop;

import oop.ex3.Circle;
import oop.ex3.Polygon;
import oop.ex3.Square;
import oop.ex3.Triangle;
import org.junit.Test;

public class TestShapeEx extends Polygon {
    @Test
    public void run() {
        Point rec1 = new Point(5, 5);
        Point rec2 = new Point(5, 10);
        Point rec3 = new Point(10, 10);
        Point rec4 = new Point(10, 5);

        Polygon S = new Square(rec1, rec2, rec3, rec4);

        S.addPoint(rec1);
        S.addPoint(rec2);
        S.addPoint(rec3);
        S.addPoint(rec4);

Point a = new Point(5, 5);
        Point b = new Point(7, 7);
        Point c = new Point(9, 5);

        Polygon T = new Triangle(a, b, c, 3.0, 2.0);
        T.addPoint(a);
        T.addPoint(b);
        T.addPoint(c);

        System.out.println(S.getArea());

        Point centre1 = new Point(10, 10);
        
        Polygon C = new Circle(centre1, 10);
        C.addPoint(centre1);

        System.out.println(C.compareByArea(S));

        System.out.println(C.getArea());

        System.out.println(T.getArea());


    }
}
