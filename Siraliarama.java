/*
Sıralı arama yapan kod bloğu örnek:
*/

package com.mycompany.siraliarama;
import java.util.Scanner;

public class Siraliarama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dizi[]={1,2,3,4,5,6,7,8,9,10};
        int aranandeger;
        boolean x=false;
        for(int i=0;i<10;i++)
        {
            System.out.print(dizi[i]+" ");
        }
        System.out.println("Aramak istediğiniz sayiyi giriniz: ");
        aranandeger= input.nextInt();
        for(int i=0;i<10;i++)
        {
            if(dizi[i]==aranandeger)
            {
                x= true;
            }
        }
        if(x)
        {
            System.out.println("Sayi dizide bulunmaktadır.");
        }
        else
        {
            System.out.println("Sayi dizide bulunmamaktadır.");
        }
        
    }
}
