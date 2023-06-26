

package com.mycompany.ikiliarama;
import java.util.Scanner;

public class Ikiliarama {
    static int ikiliara(int dizi[],int x)
    {
        int alt=0;
        int ust=dizi.length-1;
        while(alt<=ust)
        {
            int orta=(alt+ust)/2;
            if(x==dizi[orta])
            {
                return orta;
            }
            if(x>dizi[orta])
            {
                alt=orta+1;
            }
            else
            {
                ust=orta-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dizi[]={1,4,7,11,22,30,34,45,77,112};
        System.out.println("Lutfen aranan degeri giriniz: ");
        int x=input.nextInt();
        int i=ikiliara(dizi,x);
        System.out.println("i="+i);
        if(i==-1)
        {
            System.out.println(x+" dizi içinde bulunmamaktadır.");
        }
        else
        {
            System.out.println(x+" dizi içerisinde "+(i+1)+". sırada yer almaktadır.");
        }
    }
}
