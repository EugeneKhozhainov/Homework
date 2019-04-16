package oop.ex3;

import oop.Point;

public class Triangle extends Polygon {

    private Point a;
    private Point b;
    private Point c;
    private Double height;
    private Double base;

    public Triangle(Point a, Point b, Point c, Double height, Double base) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
        this.base = base;
    }

    @Override
    public Double getArea() {
        if (pointList.size() != 3) {
            throw new RuntimeException("Not triangle");
        }
        Double constant = 0.5;
        Double area = constant * height * base;

        return area;
    }
}
