

package com.mycompany.dikmirasalma;
/*
Miras Alma örnek:
*/
import java.util.Scanner;
public class Dikmirasalma {
    public double Genislik;
    public double Uzunluk;
    public double Alan()
    {
        return Genislik*Uzunluk;
    }
    public double Cevre()
    {
        return 2*(Genislik+Uzunluk);
    }
    static class Dik extends Dikmirasalma
    {
        double kosegen()
        {
            return Math.sqrt(Genislik*Genislik+Uzunluk*Uzunluk);
        }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Dik dd=new Dik();
        System.out.println("Genislik: ");
        dd.Genislik=input.nextDouble();
        System.out.println("Uzunluk: ");
        dd.Uzunluk=input.nextDouble();
        
        System.out.println("Alan: "+dd.Alan());
        System.out.println("Cevre: "+dd.Cevre());
        System.out.println("Kosegen: "+dd.kosegen());
    }
}
