abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class Q7_AbstractShape {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.printf("Circle area = %.2f%n", circle.calculateArea());
        System.out.printf("Circle perimeter = %.2f%n", circle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.printf("Triangle area = %.2f%n", triangle.calculateArea());
        System.out.printf("Triangle perimeter = %.2f%n", triangle.calculatePerimeter());
    }
}
