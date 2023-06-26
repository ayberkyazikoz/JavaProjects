
package com.mycompany.sinavsorusu1;
import java.util.Scanner;
public class Sinavsorusu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        System.out.println("Lutfen x degeri giriniz: ");
        x=input.nextDouble();
        if(x<=0)
        {
            x=x/x+Math.sqrt(x+1);
        }
        else
        {
            x=x/Math.pow(x+2,1/3);
        }
        System.out.println("X değeri: "+x);
    }
}
