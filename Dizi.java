

package com.mycompany.dizi;
import java.util.Scanner;

public class Dizi {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int dizi[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Dizinin "+(i+1)+". elemanini giriniz:");
            dizi[i]=input.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("Dizinin "+(i+1)+". elemani:"+dizi[i]);
            
        }
    }
}
