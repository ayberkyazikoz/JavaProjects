/*
buble sort örnek
*/

package com.mycompany.bublesort;


public class Bublesort {

    public static void main(String[] args) {
        int i,t,f;
        int a[]={5,31,62,-69,10,-3,1,-99};
        f=0;
        while(f==0)
        {
            f=1;
            for( i=0;i<=6;i++)
            {
                if(a[i]>a[i+1])
                {
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                    f=0;
                }
            }
        }
        for(i=0;i<8;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
