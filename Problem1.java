

package com.mycompany.problem1;
import java.util.Scanner;


public class Problem1 {

    public static void main(String[] args ) {
         double x,f,g;

       Scanner input=new Scanner(System.in);
       System.out.print("x degeri giriniz:");
       x=input.nextDouble();
       if(x>0)
       {
            f=1.0/(1.0+Math.log(x));
            g=1.0/(x+Math.log(x));
       }
       else 
       {

           f=1/(1+x*x);
           g=1/(1+x+x*x);
       }

          System.out.println("\nf(x)="+f);
        System.out.println("\ng(x)="+g);
    }
}
