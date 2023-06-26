
package com.mycompany.example2;

import java.util.Scanner;
public class Example2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1,s2;
        System.out.println("1. sayıyı giriniz..");
        s1=input.nextInt();
        System.out.println("2.sayıyı giriniz..");
        s2=input.nextInt();
        if(s1>s2)
        {
            System.out.println(s1+" buyuktur "+s2);
        }
        else if(s1<s2)
        {
            System.out.println(s1+" kucuktur "+s2);
        }
        else
            System.out.println(s1+" esittir "+s2);
    }
}
