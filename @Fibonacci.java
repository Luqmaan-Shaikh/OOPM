import java.util.Scanner;

public class Fibonacci {
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void printFibonacciSeries(int terms) {
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < terms; i++) {
            System.out.print(calculateFibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        scanner.close();

        if (terms <= 0) {
            System.out.println("Invalid input. Number of terms must be positive.");
        } else {
            printFibonacciSeries(terms);
        }
    }
}
