//NAME:-LUQMAAN SHAIKH
//ROLL NO:-22AD1009
//BATCH:-B2

import java.util.Scanner;

public class EXP2
{
public static void main(String[] args)
{
System.out.println("Prime numbers between 1 to 1000 are : ");
int i,j;
for(i=1;i<=1000;i++)
{
int c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
++c;
}
if(c==2)
System.out.println("\t"+i);
}
}
}