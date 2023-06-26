

package com.mycompany.labbasamakornek;

import java.util.Scanner;
public class Labbasamakornek {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        int s1, s2, s3;
        int carpim=0;
        
        System.out.println("Lutfen 3 basamakli bir sayi giriniz:");
        int x=input.nextInt();
        
        s1=x%10;
        s2=x%100/10;
        s3=x%1000/100;
        
        System.out.println("Birler Basamagi:"+s1);
        System.out.println("Onlar Basamagi:"+s2);
        System.out.println("Yuzler Basamagi:"+s3);
        
        carpim=s1*s2*s3;
        System.out.println("Carpim:"+carpim);
    }
}
