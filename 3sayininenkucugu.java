
package com.mycompany.tamsayininenkucugu;
//3 tam sayinin en küçğünü bulan program
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        double a,b,c;
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        a=input.nextDouble();
        System.out.println("Ikinci sayiyi giriniz..");
        b=input.nextDouble();
        System.out.println("Ucuncu sayiyi giriniz..");
        c=input.nextDouble();
        if(a<b)
        {
            if(a<c)
            {
                System.out.println("En kucuk sayi:."+a);
            }
            else
            {
                System.out.println("En kucuk sayi:."+c);
            }
        }
        else if(b<c)
        {
            System.out.println("En kucuk sayi:."+b);
        }
        else
        {
            System.out.println("En kucuk sayi:."+c);
        }
        
    }
}
