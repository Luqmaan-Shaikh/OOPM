//NAME:-LUQMAAN SHAIKH
//Roll no:-22AD1009
//BATCH:-B2

import java.util.Scanner;

// Step 2: Define a class that implements the Runnable interface
class PrintNumbers implements Runnable {
    int start, end;

    PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Step 2.2: Implement the run() method
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Thread t1: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds (0.5 seconds)
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Step 3: Define another class that implements the Runnable interface
class PrintSquares implements Runnable {
    int start, end;

    PrintSquares(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Step 3.2: Implement the run() method
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Thread t2: " + (i * i));
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds (0.5 seconds)
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Step 4: Define a user-defined main class
class EXP11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Create instances of the Runnable classes with user input values
        PrintNumbers printNumbers = new PrintNumbers(start, end);
        PrintSquares printSquares = new PrintSquares(start, end);

        // Step 6: Create threads t1 and t2
        Thread t1 = new Thread(printNumbers);
        Thread t2 = new Thread(printSquares);

        // Step 6: Start threads t1 and t2
        t1.start();
        t2.start();

        scanner.close();
    }
}

