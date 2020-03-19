package unit7;

public class day1 {

    public static void main(String[] args) {
        System.out.println(new Circle("Blue", true, 2));
    }

}

class GeometricFigure {

    private static int numObjs;//stores the number of objects
    private String color;
    private boolean filled;

    public GeometricFigure() {
    }

    public GeometricFigure(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public static int getNumObjs() {
        return numObjs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "GeometricFigure{" +
                "color='" + color + '\'' +
                ",filled=" + filled +
                '}';
    }
}

class Circle extends GeometricFigure {

    private static int numCircles;
    private double radius;

    public Circle() {

    }

    public Circle(String color, boolean filled, double radius) {
        this.setColor(color);
        this.setFilled(filled);
        this.setRadius(radius);
    }

    public static int getNumCircles() {
        return numCircles;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + this.getColor() + '\'' +
                ", filled=" + this.getFilled() +
                ", radius=" + this.getRadius() +
                ", area=" + this.getArea() +
                '}';
    }
}