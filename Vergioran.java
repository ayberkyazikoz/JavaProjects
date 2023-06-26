/*Gelire göre vergi uygulayan program (Class kullanıldı)*/

package com.mycompany.vergioran;
import java.util.Scanner;

public class Vergioran {
    static double veror1=0.25;
    static double veror2=0.3;
    static double veror3=0.35;
    static double veror4=0.4;
    static double veror5=0.5;
    
    
    public static void main(String[] args) {
        //tanımlar
        Scanner input =new Scanner(System.in);
        double gelir,vergi,v1,v2,v3,v4;
        Vergioran veror=new Vergioran();
        
        
        System.out.println("Gelir: ");
        gelir=input.nextDouble();
        v1=150000000*veror.veror1;
        v2=150000000*veror.veror2;
        v3=300000000*veror.veror3;
        v4=600000000*veror.veror4;
        
        if(gelir<=150000000)
        {
            vergi=gelir*veror1;
        }
        else if(gelir<=300000000)
        {
            vergi=v1+(gelir-150000000)*veror2;
        }
        else if(gelir<=600000000)
        {
            vergi=v1+v2+(gelir-300000000)*veror3;
        }
        else if(gelir<=1200000000)
        {
            vergi=v1+v2+v3+(gelir-600000000)*veror4;
        }
        else
        {
            vergi=v1+v2+v3+v4+(gelir-1200000000)*veror5;
        }
        System.out.println("Vergi: "+vergi);
    }
}
