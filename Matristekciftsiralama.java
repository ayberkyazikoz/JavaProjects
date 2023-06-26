package com.mycompany.matristekciftsiralama;

public class Matristekciftsiralama {
    public static void main(String[] args) {
        int a[][]={{4,13,23,45},{8,22,33,44},{46,55,62,14},{99,13,25,8}};
        int t[]=new int[8];
        int c[]=new int[8];
        int cs=0;
        int ts=0;
        int temp;
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(a[i][j]%2==0)
                {
                    c[cs]=a[i][j];
                    cs++;
                }
                else
                {
                    t[ts]=a[i][j];
                    ts++;
                }
                
            }
        }
        
        for(int i=0;i<7;i++)
        {
            for(int j=i+1;j<8;j++)
            {
                if(t[i]>t[j])
                {
                    temp=t[i];
                    t[i]=t[j];
                    t[j]=temp;
                }
            }
        }
        for(int i=0;i<7;i++)
        {
            for(int j=i+1;j<8;j++)
            {
                if(c[i]>c[j])
                {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        
        System.out.println("Tek sayilar dizisi: ");
        for(int i=0;i<8;i++)
        {
            System.out.print(t[i]+" ");
        }
        System.out.println("Cift sayilar dizisi: ");
        for(int i=0;i<8;i++)
        {
            System.out.print(c[i]+" ");
        }
        
    }    
}
