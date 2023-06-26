/*
Çıktıdan kolayca anlaşılacağı gibi,bu program, verilen bir stringi
karakterlerine parçalamakta her karakteri bir satıra
yazdırmaktadır.Stringin uzunluğunu bulmak için(kaç karakterden
oluştuğunu) length metodu kullanılmaktadır.
*/
package com.mycompany.stringfonk2;
public class Stringfonk2 {
    public static void main(String[] args) {
        String st1="melisa";
        for(int i=0;i<st1.length();i++)
        {
            System.out.println();
            System.out.println(st1.charAt(i));
        }
    }
}
