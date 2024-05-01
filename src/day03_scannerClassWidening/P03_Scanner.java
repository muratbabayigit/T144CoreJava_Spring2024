package day03_scannerClassWidening;

import java.util.Scanner;

public class P03_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        dikdortgenin alanini yazdirin.
         */


        Scanner scan=new Scanner(System.in);

        System.out.println("Alanı bulunacak dikdörgenin kısa ve uzun kenar ölçülerini giriniz");
        System.out.print("Kısa kenar uzunluğu: ");
        double kkenar= scan.nextDouble();
        System.out.print("Uzun kenar uzunluğu: ");
        double ukenar= scan.nextDouble();
        double alan=(kkenar*ukenar);
        System.out.println("Dikdörtgenin Alanı: "+alan);


    }
}
