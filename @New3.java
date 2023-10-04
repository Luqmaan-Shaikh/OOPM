import java.io.*;
public class New3 {
    public static void main(String[] args) throws IOException{
		
	InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br = new BufferedReader(isr);
String sPlaceHolder;
final double dGoal = 1000000;  //constant
double dEarnings = 0;
double dMissing = 0;
System.out.print("How much do you make per hour?  ");
sPlaceHolder = br.readLine( );
dEarnings = Double.parseDouble(sPlaceHolder);
dMissing = dGoal - dEarnings;
System.out.println("\nIn one hours you will only need " + dMissing + "more to earn your goal");
	}
}