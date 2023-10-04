import java.util.Scanner;

public class SumOfDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // Input the elements of the matrix
        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of diagonals
        int mainDiagonalSum = sumOfMainDiagonal(matrix);
        int secondaryDiagonalSum = sumOfSecondaryDiagonal(matrix);

        // Display the sum of diagonals
        System.out.println("Sum of the Main Diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the Secondary Diagonal: " + secondaryDiagonalSum);

  
    }

    public static int sumOfMainDiagonal(int[][] matrix) {
        int size = matrix.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += matrix[i][i]; // Main diagonal elements have the same row and column indices
        }

        return sum;
    }

    public static int sumOfSecondaryDiagonal(int[][] matrix) {
        int size = matrix.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += matrix[i][size - 1 - i]; // Secondary diagonal elements have row index + column index = size - 1
        }

        return sum;
    }
}
