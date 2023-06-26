package com.mycompany.ekle;
import java.util.Scanner;

public class Ekle {
    double topla(double a,double b)
    {
        return a+b;
    }
    int topla(int a,int b)
    {
        return a+b;
    }
    String topla(String a,String b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b;
        Ekle e=new Ekle();
        
        System.out.println("İlk Ondalık Sayı: ");
        a=input.nextDouble();
        System.out.println("İkinci Ondalık Sayı: ");
        b=input.nextDouble();
        
        System.out.println("Toplam: "+e.topla(a,b));
        
        
        
        
        System.out.println("İlk Tam Sayı: ");
        a=input.nextDouble();
        System.out.println("İkinci Tam Sayı: ");
        b=input.nextDouble();
        
        System.out.println("Toplam: "+e.topla(a,b));
    }
}
