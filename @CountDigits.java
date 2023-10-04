import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 + countDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            number = -number; // Handle negative numbers by converting to positive
        }

        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);
    }
}
