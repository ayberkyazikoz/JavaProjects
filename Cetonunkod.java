
package com.mycompany.cetonunkod;

import java.util.Scanner;

public class Cetonunkod {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][] dizi=new int[5][3];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Dizinin "+(i+1)+". satir "+(j+1)+". sütununu giriniz:");
                dizi[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(dizi[i][j]+" ");
                
            }
            System.out.println();
        }
        
    }
    
}
//700 600 650
//900 800 700
//300 400 350
//500 450 470
//600 500 480