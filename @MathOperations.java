import java.util.Scanner;

public class MathOperations {
    public static int plusMethod(int a, int b) {
        return a + b;
    }

    public static double plusMethod(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer value for a: ");
        int intA = s.nextInt();

        System.out.print("Enter an integer value for b: ");
        int intB = s.nextInt();

        int intResult = plusMethod(intA, intB);
        System.out.println("Int Result: " + intResult);

        System.out.print("Enter a double value for a: ");
        double doubleA = s.nextDouble();

        System.out.print("Enter a double value for b: ");
        double doubleB = s.nextDouble();

        double doubleResult = plusMethod(doubleA, doubleB);
        System.out.println("Double Result: " + doubleResult);

  
    }
}