//NAME:-LUQMAAN SHAIKH
//Roll no:-22AD1009
//BATCH:-B2

import java.util.Scanner;

// Step 2: Create class Student
class Student {
    String roll_no;

    // 2.1: Declare roll_no as int type
    void getnumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll_no = scanner.nextLine();
    }

    // 2.2: Write getnumber() method to get roll number of a student
    void putnumber() {
        System.out.println("\nRoll Number: " + roll_no);
    }
}

// Step 3: Define class Test which extends student
class Test extends Student {
    float sem1, sem2;

    // 3.1: Declare sem1, sem2 as float type
    void getmarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Semester 1 Marks: ");
        sem1 = scanner.nextFloat();
        System.out.print("Enter Semester 2 Marks: ");
        sem2 = scanner.nextFloat();
    }

    // 3.2: Write getmarks() method to get marks of a student
    void putmarks() {
        System.out.println("Semester 1 Marks: " + sem1);
        System.out.println("Semester 2 Marks: " + sem2);
    }
}

// Step 4: Define interface Sports
interface Sports {
    float score = 0.0f; // 4.1: Declare score of float type

    void getscore(); // 4.2: Declare getscore();
}

// Step 5: Define class Result which extends Test and implements Sports
class Result extends Test implements Sports {
    float total, sportsScore;

    // 5.2: Write display() method; Calculate total of sem1, sem2 & score
    void display() {
        total = sem1 + sem2 + sportsScore;
        putnumber();
        putmarks();
        putscore();
        System.out.println("Total Marks: " + total);
    }

    // 5.3: Write putscore() method to display sports score
    public void putscore() {
        System.out.println("Sports Score: " + sportsScore);
    }

    // 5.4: Implement getscore() method to get sports score
    public void getscore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sports Score: ");
        sportsScore = scanner.nextFloat();
    }
}

// Step 7: Define Main method, Create object of class Result and Invoke getnumber(), getmarks(), getscore(), display().
public class EXP9 {
    public static void main(String[] args) {
        Result result = new Result();
        result.getnumber();
        result.getmarks();
        result.getscore();
        result.display();
    }
}
