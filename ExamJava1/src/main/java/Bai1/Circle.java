package Bai1;

public class Circle {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        if (radius < 0) {
            throw new RuntimeException("ERROR");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * 2 * Math.PI;
    }

    public double getCircumfence(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                " Area= " + getArea() +
                " Circumfence= " + getCircumfence() +
                '}';
    }
}
