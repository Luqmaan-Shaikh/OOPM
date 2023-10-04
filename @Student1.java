import java.util.Scanner;

public class Student1 {
    private String name;
    private String rollNumber;
    private int age;
    private String grade;

    public Student1(String name, String rollNumber, int age, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.grade = grade;
    }

    public void readInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        this.rollNumber = scanner.nextLine();
        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
        System.out.print("Enter grade: ");
        this.grade = scanner.next();
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Age: " + this.age);
        System.out.println("Grade: " + this.grade);
    }

    public static void main(String[] args) {
        Student1 student = new Student1("", "", 0, "");
        student.readInfo();
        System.out.println();
        student.displayInfo();
}
}