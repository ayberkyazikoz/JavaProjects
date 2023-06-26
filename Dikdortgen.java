/*Diktörgenin Alanını ve Çevresini hesaplamak için class
içine metot ekledim.
*/

package com.mycompany.dikdortgen;
import java.util.Scanner;

public class Dikdortgen {
    double Genislik;
    double Uzunluk;
    double Alan()
    {
        return Genislik*Uzunluk;
    }
    double Cevre()
    {
        return 2*(Genislik+Uzunluk);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Dikdortgen dd=new Dikdortgen();
        
        System.out.println("Genislik: ");
        dd.Genislik=input.nextDouble();
        System.out.println("Uzunluk: ");
        dd.Uzunluk=input.nextDouble();
        
        double a=dd.Alan();
        double c=dd.Cevre();
        System.out.println("Alan: "+a);
        System.out.println("Cevre: "+c);
    }
}
