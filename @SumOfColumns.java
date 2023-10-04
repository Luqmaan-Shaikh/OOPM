import java.util.Scanner;

public class SumOfColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Input the elements of the matrix
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of columns
        int[] columnSums = sumOfColumns(matrix);

        // Display the sum of columns
        System.out.println("Sum of Columns:");
        for (int i = 0; i < cols; i++) {
            System.out.println("Column " + (i + 1) + ": " + columnSums[i]);
        }

        
    }

    public static int[] sumOfColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] columnSums = new int[cols];

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }

        return columnSums;
    }
}
