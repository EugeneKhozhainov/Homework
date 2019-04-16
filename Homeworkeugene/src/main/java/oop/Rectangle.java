package oop;

public class Rectangle implements AreaInterface {

   private Point lowerLeft;
   private Point upperLeft;
   private Point upperRight;
   private Point lowerRight;


    public Rectangle(Point lowerLeft, Point upperLeft, Point upperRight, Point lowerRight) {
        this.lowerLeft = lowerLeft;
        this.upperLeft = upperLeft;
        this.upperRight = upperRight;
        this.lowerRight = lowerRight;
    }

    public Double getDiagonalLength(){
        Double distance = lowerLeft.distance(upperRight);
        return distance;
    }

    public Double getArea() {
        return null;
    }
}
