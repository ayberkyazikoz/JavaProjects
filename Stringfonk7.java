/*
Elemanları "ankara","antalya","burdur","bursa","anadolu" olan st1 adlı
string dizisi oluşturulmuş ve bu dizinin elemanları arasında “an” ile
başlayanlar,”a” ile bitenler ve 2 ve 3 indisli karakterleri “ka” olanlar
listelenmiştir.
*/
package com.mycompany.stringfonk7;
public class Stringfonk7 {
    public static void main(String[] args) {
        String st1[]={"ankara","antalya","burdur","bursa","anadolu"};
        int i;
        for(i=0;i<st1.length;i++)
        if(st1[i].startsWith("an"))
        {System.out.println();
        System.out.println(st1[i]+" stringi an harfleri ile başlıyor");
        }
        System.out.println();
        for(i=0;i<st1.length;i++)
        if(st1[i].endsWith("a"))
        {System.out.println();
        System.out.println(st1[i]+" stringi a harfi ile bitiyor");
        } 
        System.out.println();
        for(i=0;i<st1.length;i++)
        if(st1[i].startsWith("ka",2))
        {System.out.println();
        System.out.println(st1[i]+" stringi 2. indisten itibaren ka harfleri ile başlıyor");
        }
    }
}
