/*
Sirala adlı sınıf,10 elemanlı bir x dizisine ve bir de yer
değiştirme sıralaması yöntemine göre 10 elemanlı bir diziyi
sıralayan YerDeg() adlı bir metoda sahiptir.
*/

package com.mycompany.sirala;


public class Sirala {
    double Dizi[]={0,0,0,0,0,0,0,0,0,0};
    void YerDeg()
    {
        double t;
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(Dizi[i]>Dizi[j])
                {
                    t=Dizi[i];
                    Dizi[i]=Dizi[j];
                    Dizi[j]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Sirala sir=new Sirala();
        System.out.println("Siralanmamais dizi: ");
        for(int i=0;i<10;i++)
        {
            sir.Dizi[i]=(1+i)*10.0*Math.random();
            System.out.println(sir.Dizi[i]);
        } 
        sir.YerDeg();
        System.out.println("Siralanmis dizi: ");
        for(int i=0;i<10;i++)
        {
            System.out.println(sir.Dizi[i]);
        }
    }
}
