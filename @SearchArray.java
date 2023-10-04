import java.util.Scanner;

public class SearchArray {
    public static int searchElement(int[] arr, int target, int index) {
        if (index < 0 || index >= arr.length) {
            return -1; // Element not found
        }

        if (arr[index] == target) {
            return index; // Element found at index
        } else {
            return searchElement(arr, target, index + 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
       

        int foundIndex = searchElement(arr, target, 0);

        if (foundIndex != -1) {
            System.out.println("Element found at index " + foundIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}