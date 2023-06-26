
package com.mycompany.xxxxxx;


public class Xxxxxx {

    public static void main(String[] args) {
        int t[][]={{3,2,7,55,5,23},{7,-2,9,60,-3,-5}};
        int dizi[]=new int[12];
        int dizi2[]=new int[10];
        int k=0;
        
        int temp;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<6;j++)
            {
                dizi[k]=t[i][j];
                k++;
            }
        }
        for(int i=0;i<11;i++)
        {
            for(int j=i+1;j<12;j++)
            {
                if(dizi[i]<dizi[j])
                {
                    temp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                    
                }
            }
        }
        int k2=0;
        for(int i=1;i<11;i++)
        {
            dizi2[k2]=dizi[i];
            k2++;
        }
        
        for(int j=0;j<10;j++)
            {
                System.out.print(dizi2[j]+" ");
            }
        
    }
}
