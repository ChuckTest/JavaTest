package hw01;

public class Task7 {
    public class Circle {
        double centerX;
        double centerY;
        double radius;

        public Circle() {
            this(1.0);
        }

        public Circle(double tempRadius) {
            radius = tempRadius;
        }

        double getArea() {
            return Math.PI * radius * radius;
        }

        double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }
}
