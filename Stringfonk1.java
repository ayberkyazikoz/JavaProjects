/*
Aşağıdaki Java programı, equals metodunun kullanılışı 
ile ilişkili bir örnek oluşturmaktadır:
*/
package com.mycompany.stringfonk1;
public class Stringfonk1 {
    public static void main(String[] args) {
        String st1="melisa";
        if(st1.equals("melisa"))
        {
            System.out.println();
            System.out.println("string melisa dır.");           
        }
        if(st1.equals(("MELISA")))
        {
            System.out.println();
            System.out.println("string MELISA dır.");
        }
        if(st1.equalsIgnoreCase(("MELISA")))
        {
            System.out.println();
            System.out.println("string MELISA dır.");
        }
    }
}
/*
Yukardaki programda bulunan 3 adet if’ten birinci ve üçüncü doğru
ikincisi ise yanlış olacaktır ve o nedenle 2 mesaj alınacaktır.
*/