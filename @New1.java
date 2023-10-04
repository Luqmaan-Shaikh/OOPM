import java.io.*;
public class New1 {
    public static void main(String[] args) throws IOException{
		
	InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br = new BufferedReader(isr);
String sName;
System.out.print("What is your name?   ");
sName = br.readLine( );
System.out.println("So your name is " + sName);
}
}
}