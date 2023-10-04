import java.util.Scanner;
class Rectangle 
{
  int length, width; 
  Rectangle(int l, int b) 
    { length = l; width = b; } 
  void area(Rectangle r1) 
    { 
      int areaOfRectangle = r1.length * r1.width; 
      System.out.println("Area of Rectangle : " + areaOfRectangle); 
    }
 }
class RectangleDemo 
 {
       public static void main(String args[]) 
           {
			   Scanner sc = new Scanner(System.in);
			   System.out.println("lenght:-");
			   int l=sc.nextInt();
			   System.out.println("breadth:-");
			   int b=sc.nextInt();
                Rectangle r1 = new Rectangle(l,b);
                r1.area(r1);
           }
 }
