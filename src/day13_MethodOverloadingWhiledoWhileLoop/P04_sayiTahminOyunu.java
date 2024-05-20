package day13_MethodOverloadingWhiledoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class P04_sayiTahminOyunu {
    public static void main(String[] args) {
        /*
        1-Sisteme tahmin edilecek bir sayı tanımlayın
        2-Kullanıcıdan bir sayı isteyin
        3-Sayı tanımlanan sayıdan fazla ise azal, çok söyledin desin, az ise az söyledin arttır desin
        4-doğru bilirse ebrik edip kodun çalışmasını durdursun
         */
        //int a = 128;

        Random random = new Random();
        int sayi = random.nextInt(100); //0-100 arası
        // int sayi= random.nextInt(10,100); //10-100 arası
        Scanner scan = new Scanner(System.in);
        System.out.print("Aklımdan 100'den küçk bir sayı tuttum.\nHadi tahmin et enter'a bas!: ");

        boolean dogruMu = false;


        while (!dogruMu) {
            int tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("Çok söyledin azalt!");
            } else if (tahmin < sayi) {
                System.out.println("Az söyledin arttır!");
            } else {
                System.out.println("Tebrikler. Doğru bildiniz! Aklımdaki sayı: " + sayi);
                dogruMu = true;
            }
        }

    }
}
