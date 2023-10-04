//NAME:-LUQMAAN SHAIKH
//ROLL NO:-22AD1009
//BATCH:-B2

import java.util.Scanner;

class Complex {
    int real,imaginary;
    char c='+';
    Complex(){
        real=imaginary=0;
    }
    Complex(int r,int i){
        real=r;
        imaginary=i;
        c='+';
    }
    void show(){
        if(imaginary<0)
            c='-';

        System.out.println(real+" "+c+" " +imaginary+"i");
    }
    Complex add(Complex c1,Complex c2){
        Complex sum=new Complex();
        sum.imaginary=c1.imaginary+c2.imaginary;
        sum.real=c1.real+c2.real;
        return sum;
    }
}
public class EXP5{
    public static void main(String[] args) {
        Complex c1=new Complex(1,2);
        Complex c2=new Complex(3,5);
        c1.show();
        c2.show();
        Complex sum;
        sum=c1.add(c1,c2);
        sum.show();
    }
}