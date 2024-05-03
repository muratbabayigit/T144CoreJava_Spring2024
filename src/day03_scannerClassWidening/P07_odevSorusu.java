package day03_scannerClassWidening;

import java.util.Scanner;

public class P07_odevSorusu {
    //SORU: (Interview) Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int a=scan.nextInt(); //a=10
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int b=scan.nextInt(); //b=25

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a=a+b; //a=35 b=25
        b=a-b; // a=35 b=10
        a=a-b; //a=25 b=10

        System.out.println("Waaaaadaaaaaa");
        System.out.println("------------------------------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }

}
