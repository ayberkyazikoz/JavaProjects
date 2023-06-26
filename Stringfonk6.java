/*
Anadolu stringinin indisi 3 olan d karakterinden indisi 7-1=6 olan
karakterine kadar ( u ) olan kısmı karDiz adlı diziye
kopyalanmıştır.karDiz adlı dizinin içeriği “dolu” olarak atanmıştır.
*/
package com.mycompany.stringfonk6;
public class Stringfonk6 {
    public static void main(String[] args) {
        String st1="anadolu";
        char karDiz[];
        karDiz= new char[7];
        System.out.println("KARAKTER"+"    "+"INDEKSI");
        for(int i=0;i<=st1.length()-1;i++)
        {
            System.out.println(st1.charAt(i)+"    "+st1.indexOf(st1.charAt(i)));
            
        }
        st1.getChars(3, 7, karDiz, 0);
        System.out.println("Dizi: ");
        for(int j=0;j<karDiz.length;j++)
        {
            System.out.println(karDiz[j]);
        }

    }
}
