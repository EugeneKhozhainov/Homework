package oop;

public final class Point{

    private Integer x;
    private Integer y;


    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        super();
    }

    public Double distance(Point point){
        int a = point.getX() - getX();
        a = a * a;
        int b = point.getY() - getY();
        b = b * b;
        double distance = Math.sqrt(a + b);
        return distance;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Point translate(int x, int y){
        int a = getX() + x;
        int b = getY() + y;
        return new Point(a, b);
    }

    public Point scale(int scale){
        int a = getX() * scale;
        int b = getY() * scale;
        return new Point(a, b);
    }

}
