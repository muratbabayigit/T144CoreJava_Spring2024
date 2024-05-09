package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P03_TernaryOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int a = scan.nextInt();
        // if (a>10){
        //     a*=2;
        //     System.out.println(a);
        // }else{
        //     a+=10;
        //     System.out.println(a);
        // }

        // ***Ternary Çözüm***

        a = a > 10 ? a * 2 : a + 10;
        System.out.println(a);

        System.out.print(" Bir sayı giriniz: ");
        int b = scan.nextInt();


        System.out.println(b % 2 == 0 ? "çift sayı" : "tek sayı");

    }
}
