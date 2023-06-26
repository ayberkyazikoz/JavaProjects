
package com.mycompany.faktoriyel;

import java.util.Scanner;
public class Faktoriyel {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int fakt,i;
        fakt=1;
        i=2;
        while(fakt<720)
        {
            fakt=fakt*i;
            i++;
        }
        System.out.println("\nFAKTORYEL="+fakt);
        System.out.println("\ni="+i);
    }
}
