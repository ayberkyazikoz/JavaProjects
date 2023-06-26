/*
Programda,st1 stringi içindeki anadolu karakter dizisinin her harfi ve bu
harfin karakter dizisi içindeki indisi birer satıra yazdırılmıştır.
*/
package com.mycompany.stringfonk5;
public class Stringfonk5 {
    public static void main(String[] args) {
        String st1="anadolu";
        System.out.println("KARAKTER"+" "+"INDEKSI");
        for(int i=0;i<st1.length();i++)
        {
            System.out.println(st1.charAt(i)+" "+st1.indexOf(st1.charAt(i)));
        }
    }
}
