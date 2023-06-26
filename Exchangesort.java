/*
Exchange sort örnek
*/
package com.mycompany.exchangesort;

public class Exchangesort {
    static void Excsort(int dizi[],int x)
    {
        int i,j,k;
        for(i=0;i<x-1;i++)
        {
            for(j=i+1;j<x;j++)
            {
                if(dizi[i]>dizi[j])
                {
                    k=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=k;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []dizi={34,-6,21,445,6,99,64,2,3,-43};
        Excsort(dizi,10);
        System.out.println("Sıralanmış dizi: ");
        for(int i=0;i<10;i++)
        {
            System.out.print(dizi[i]+" ");
        }
        
    }
}
