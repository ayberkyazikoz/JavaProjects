
package com.mycompany.problem3;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz...");
        sayi=input.nextInt();
        if(sayi>0)
        {
            System.out.println("Karekok="+Math.sqrt(sayi));
        }
        else
        {
            System.out.println("Girilen sayi 0 dan kucuktur.");
        }
    }
}
