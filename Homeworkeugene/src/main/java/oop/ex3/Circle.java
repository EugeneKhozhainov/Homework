package oop.ex3;

import oop.Point;

public class Circle extends Polygon {
    private Point centre;
    private Integer radius;

    public Circle(Point centre, Integer radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        if(pointList.size() != 1){
            throw new RuntimeException("Not circle");
        }
        Double area = 2 * Math.PI * radius;
        return area;
    }
}
