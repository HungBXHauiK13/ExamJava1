package Bai1;

public class TestMain {
    public static void main(String[] args) {
        // contructor default
        Circle c1 = new Circle();
        System.out.println("Radius cu: " + c1.getRadius()); // default radius
        c1.setRadius(5); // set radius moi
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumfence());

        // contructor 2
        Circle c2 = new Circle(6);
        System.out.println(c2);
        System.out.println(c2.getArea());
        System.out.println(c2.getCircumfence());

        // testError
        Circle c3 = new Circle(-1);
        System.out.println(c3);
    }
}
