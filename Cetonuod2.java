

package com.mycompany.cetonuod2;
import java.util.Scanner;
public class Ddikdortgen{
  double genislik;
  double uzunluk;
  double Alan(){
    return genislikuzunluk;
  }
  double Cevre(){
    return 2(genislik+uzunluk);
  }
  public static void main (String[] args) {
    Scanner input=new Scanner(System.in);
    DikDortgen dd = new DikDortgen();

    System.out.println("genislik gir:");
    dd.genislik=input.nextDouble();
    System.out.println("uzunluk gir :");
    dd.uzunluk=input.nextDouble();
  }
}


