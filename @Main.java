import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14159265358979323846 * radius * radius;
    }

    public double circumference() {
        return 2 * 3.14159265358979323846 * radius;
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length and width of the rectangle: ");
        double rectLength = scanner.nextDouble();
        double rectWidth = scanner.nextDouble();
        Rectangle rect = new Rectangle(rectLength, rectWidth);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        System.out.print("Enter the lengths of the triangle's sides (separated by spaces): ");
        double triangleSide1 = scanner.nextDouble();
        double triangleSide2 = scanner.nextDouble();
        double triangleSide3 = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);

        scanner.close();

        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Circumference: " + circle.circumference());

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
    }
}
