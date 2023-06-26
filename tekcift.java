
package com.mycompany.example4;

import java.util.Scanner;
public class Example4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz..");
        int sayi=input.nextInt();
        if(sayi%2==0)
            System.out.println("Sayı çifttir.");
        else
            System.out.println("Sayı tektir.");
    }
}
