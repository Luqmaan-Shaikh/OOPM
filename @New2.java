import java.io.*;
public class New2 {
    public static void main(String[] args) throws IOException{
		
	InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br = new BufferedReader(isr);
String sPlaceHolder;
int iAge =0; 
int iYear = 2023;

System.out.print("How old are you?  " );
sPlaceHolder = br.readLine( );
iAge = Integer.parseInt(sPlaceHolder);
System.out.println("So you are  " + iAge + " years old");
System.out.println("you were probably born in "+ (iYear - iAge));
}
}
