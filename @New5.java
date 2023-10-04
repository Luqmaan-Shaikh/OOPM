import java.util.Scanner;
class New5{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		final double dGoal = 1000000;  //constant
double dEarnings = 0;
double dMissing = 0;
System.out.print("How much do you make per hour?  ");
dEarnings = s.nextDouble(  );
dMissing = dGoal - dEarnings;
System.out.println("\nIn one hours you will only need " + dMissing + "more to earn your goal");
}
}
