/*
Dairenin yaricapi girildiğinde Alanını ve Cevresini
hesaplayan program (Class kullanıldı yarıcap->özellik
Alan ve Cevreyi hesaplayan fonksiyonlar->Metot.
*/
package com.mycompany.daire;
import java.util.Scanner;

public class Daire {
    public double Yaricap;
    public double Alan()
    {
        return 3.14159*Yaricap*Yaricap;
    }
    public double Cevre()
    {
        return 2*3.14159*Yaricap;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Daire d=new Daire();
        System.out.println("Lutfen yaricap giriniz:");
        d.Yaricap=input.nextDouble();
        System.out.println("Alan: "+d.Alan());
        System.out.println("Cevre: "+d.Cevre());
    }
}
