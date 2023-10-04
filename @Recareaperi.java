import java.util.Scanner;
class Rectangle{
int l;
int b;
void Rarea() {
	System.out.println("Area of Rectangle="+(l*b));
}
void Rperimeter() {
	System.out.println("Perimeter of Rectangle="+(2*(l+b)));
}
}

public class Recareaperi{
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	Rectangle rect = new Rectangle();
	int l, b;
	System.out.println("Enter Lenght:-");
	l=s.nextInt();
	System.out.println("Enter Breadth:-");
	b=s.nextInt();
	rect.l=l;
	rect.b=b;
	rect.Rarea();
	rect.Rperimeter();
}
}