package oop;

public class Circle implements AreaInterface {
    private Point centre;
    private Integer radius;

    public Circle(Point centre, Integer radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public Double getCircleLength(){
        Double circleLength = 2 * Math.PI * radius;
        return circleLength;
    }

    public Double getArea() {
        return null;
    }
}
