import java.util.Scanner;
public class SumAvg{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter length of array");
int n=sc.nextInt();
int [] arr= new int[n];
System.out.println("Enter elements of array");

for(int i=0;i<n;i++)
    {
	int a=sc.nextInt();
	arr[i]=a;
	}
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=arr[i];
	}
	float avg=(float)sum/n;
	System.out.println("sum="+sum+"\n"+"avg="+avg);
}
}