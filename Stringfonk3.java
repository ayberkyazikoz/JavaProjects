/*
Melisa sözcüğü alfabetik ortamda zehra’dan daha önce gelir ve bu
nedenle daha küçük kabul edilir;o nedenle i’nin sayısal değeri negatif
bir tam sayı olarak atanmıştır.
*/
package com.mycompany.stringfonk3;
public class Stringfonk3 {
    public static void main(String[] args) {
        String st1="melisa";
        int i;
        i=0;
        i=st1.compareTo("zehra");
        System.out.println(st1);
        if(i==0)
        {
            System.out.println();
            System.out.println(st1+" = "+"zehra");
        }
        if(i>0)
        {
            System.out.println();
            System.out.println(st1+" > "+"zehra");
        }
        if(i<0)
        {
            System.out.println();
            System.out.println(st1+" < "+"zehra");
        }
        System.out.println("i: "+i);
    }
}
