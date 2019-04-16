package oop.ex3;

import oop.Point;

import java.util.ArrayList;
import java.util.List;

public class Polygon implements Shape {
    List<Point> pointList = new ArrayList<>();

    public void addPoint(Point point) {
        pointList.add(point);
    }


    @Override
    public Double getArea() {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean compareByArea(Shape shape) {
        return shape.getArea() == getArea();

    }
}
