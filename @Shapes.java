import java.util.Scanner;

class Circle  {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle  {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = s.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Area of Circle: " + circle.area());

        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = s.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double rectangleHeight = s.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);
        System.out.println("Area of Rectangle: " + rectangle.area());

 
    }
}