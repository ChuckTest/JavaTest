package hw01;

public class Task7 {
    public class Circle {
        double centerX;
        double centerY;
        double radius;

        double getArea() {
            return Math.PI * radius * radius;
        }

        double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }
}
