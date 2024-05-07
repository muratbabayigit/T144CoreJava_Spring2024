package day05_OperatorsIfElseStatements;

import java.util.Scanner;

public class P05_IfStatements {
    // Soru :  Kullanicidan bir harf alin,
    //         harf ile baslayan bir ay varsa yazdirin.
    //         NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
    //         Kullanici o veya O yazdiginda output Ocak olsun.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz: ");
        char ilkHarf = scan.nextLine().charAt(0);

        if (ilkHarf == 'O' || ilkHarf == 'o') {
            System.out.println("Ocak");
        }

        if (ilkHarf == 'Ş' || ilkHarf == 'ş' || ilkHarf == 's' || ilkHarf == 'S') {
            System.out.println("Şubat");
        }

        if (ilkHarf == 'M' || ilkHarf == 'm') {
            System.out.println("Mart veya Mayıs");
        }
        if (ilkHarf == 'N' || ilkHarf == 'n') {
            System.out.println("Nisan");
        }

        if (ilkHarf == 'H' || ilkHarf == 'h') {
            System.out.println("Haziran");
        }

        if (ilkHarf == 'T' || ilkHarf == 't') {
            System.out.println("Temmuz");
        }

        if (ilkHarf == 'A' || ilkHarf == 'a') {
            System.out.println("Ağustos veya Aralık");
        }

        if (ilkHarf == 'E' || ilkHarf == 'e') {
            System.out.println("Eylül veya Ekim");
        }

        if (ilkHarf == 'K' || ilkHarf == 'k') {
            System.out.println("Kasım");
        }

    }

}
