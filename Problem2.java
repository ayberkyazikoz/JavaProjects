
package com.mycompany.problem2;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        int satis,maas;
        Scanner input=new Scanner(System.in);
        System.out.println("Satış Miktarı Giriniz...");
        satis=input.nextInt();
        if(satis<50)
        {
            maas=40000+satis*500;
        }
        else
        {
            maas=50000+50*500+(satis-50)*600;
        }
        System.out.println("Maasınız:"+maas);
    }
}
