//NAME:-LUQMAAN SHAIKH
//Roll no:-22AD1009
//BATCH:-B2

import java.util.Scanner;

// Step 2: Create the base class Circle
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}

// Step 3: Derive class Area from the base class Circle
class Area extends Circle {
    double area;

    Area(double radius) {
        super(radius);
    }

    void calculate() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    void display() {
        System.out.printf("Area of the circle with radius %.2f is %.2f square units.%n", this.radius, this.area);
    }
}

// Step 4: Derive another class Volume from Area
class Volume extends Area {
	
    double volume;

    Volume(double radius) {
        super(radius);
    }

    void calculate() {
        // Calculate the volume of a sphere using the overridden 'calculate' method
        this.volume = (4.0 / 3.0) * 3.14 * Math.pow(this.radius, 3);
    }

    void display() {
        // Use the overridden 'display' method to display the volume
        System.out.printf("Volume of the sphere with radius %.2f is %.2f cubic units.%n", this.radius, this.volume);
    }
}

// Step 5: Main program
public class EXP8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create an instance of the Volume class
        Volume sphere = new Volume(radius);

        // Calculate and display the volume of the sphere
        sphere.calculate();
        sphere.display();
        
        
    }
}