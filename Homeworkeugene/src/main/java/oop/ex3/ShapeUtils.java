package oop.ex3;

public final class ShapeUtils extends Polygon {

    private ShapeUtils() {

    }

    static boolean isSquare(Polygon polygon) {
        if (polygon instanceof Square) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isCircle(Polygon polygon) {
        if (polygon instanceof Circle) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isTriangle(Polygon polygon) {
        if (polygon instanceof Triangle) {
            return true;
        } else {
            return false;
        }
    }
}
