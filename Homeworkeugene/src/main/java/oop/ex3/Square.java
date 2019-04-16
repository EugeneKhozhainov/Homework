package oop.ex3;

import oop.Point;

public class Square extends Polygon {

    private Point lowerLeft;
    private Point upperLeft;
    private Point upperRight;
    private Point lowerRight;

    public Square(Point lowerLeft, Point upperLeft, Point upperRight, Point lowerRight) {
        this.lowerLeft = lowerLeft;
        this.upperLeft = upperLeft;
        this.upperRight = upperRight;
        this.lowerRight = lowerRight;
    }

    @Override
    public Double getArea() {
       if(pointList.size() != 4) {
           throw new RuntimeException("Not square");
       }
       Double area = (upperLeft.getY().doubleValue() - lowerLeft.getY().doubleValue()) * 2;
       return area;
    }
}
