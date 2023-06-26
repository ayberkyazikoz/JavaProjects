
import java.util.Scanner;


public class example5 {
    public static void main(String[] args)
    {
        Scanner ayberk=new Scanner(System.in);
        double number1,number2,number3;
        double total,ort=0;
        System.out.println("1. sayıyı giriniz..");
        number1=ayberk.nextDouble();
        System.out.println("2. sayıyı giriniz..");
        number2=ayberk.nextDouble();
        System.out.println("3. sayıyı giriniz..");
        number3=ayberk.nextDouble();
        total=number1+number2+number3;
        ort=total/3;
        System.out.println("toplam="+total);
        System.out.println("ortalama="+ort);
    }
    
}
