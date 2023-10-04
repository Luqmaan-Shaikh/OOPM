import java.util.Scanner;
public class Student{	
	String name;
	String classyear;
   	String sem;
	
	void display(){
		System.out.println("Name:- "+name+"\nClass_Year:- "+classyear+"\nSem:- "+sem);
	}
	
	void read(){
		Scanner s = new Scanner(System.in);
		System.out.println("Name - ");
		name=s.nextLine();
		System.out.println("Class_Year - ");
		classyear=s.nextLine();
		System.out.println("Sem - ");
		sem=s.nextLine();
	}

 public static void main(String[] args){
	 Student student=new Student();
	 student.read();
	 student.display();
 }
}