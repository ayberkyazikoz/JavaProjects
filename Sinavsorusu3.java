package com.mycompany.sinavsorusu3;
public class Sinavsorusu3 {
    public static double Faktoriyel(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        double toplam=0;
        double carpim=1;
        for(int a=2;a<31;a++)
        {
            toplam= toplam+((a/Faktoriyel(a+1))*carpim);
            carpim*=-1;
        }
        System.out.println("Toplam: "+toplam);
    }
    
}

