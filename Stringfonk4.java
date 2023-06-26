/*
Melisa alfabetik ortamda ayse’den önce gelmediği için i’nin
değeri pozitif bir sayı olarak çıkmıştır.
*/
package com.mycompany.stringfonk4;
public class Stringfonk4 {
    public static void main(String[] args) {
        String st1="melisa";
        int i;
        i=st1.compareTo("ayse");
        System.out.println(st1);
        if(i==0)
        {
            System.out.println();
            System.out.println(st1+" = "+"ayse");
        }
        if(i>0)
        {
            System.out.println();
            System.out.println(st1+" > "+"ayse");
        }
        if(i<0)
        {
            System.out.println();
            System.out.println(st1+" < "+"ayse");
        }
        System.out.println("i: "+i);
    }
}
