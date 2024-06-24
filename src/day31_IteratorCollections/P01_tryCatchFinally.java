package day31_IteratorCollections;

import java.util.Scanner;

public class P01_tryCatchFinally {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İki adet tam sayı giriniz");
        System.out.print("Birinci Sayı: ");
        int sayi1=scan.nextInt();
        System.out.print("İkinci Sayı: ");
        int sayi2=scan.nextInt();


        try {
            System.out.println("İki Sayının Bölümü:"+sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("İkinci Sayı sıfır olamaz");
        } finally {
            System.out.println("finally blok çalıştı");
        }
    }
}
