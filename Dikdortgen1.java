

package com.mycompany.dikdortgen1;
import java.util.Scanner;

public class Dikdortgen1 {
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
        Scanner input = new Scanner(System.in);
        System.out.println("Genişlik giriniz:");
        Dikdortgen1 d = new Dikdortgen1();
        d.Uzunluk = input.nextDouble();
        d.Genislik = input.nextDouble();
        System.out.println("Alan= "+d.Alan());
        System.out.println("Cevre= "+d.Cevre());
    }
}
