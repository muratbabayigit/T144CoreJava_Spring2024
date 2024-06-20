package day30_Exceptions;

import java.util.Scanner;

public class P09_KontrolluException {
    public static void main(String[] args) {


        /*
        Eğer bazı durumlarda herhangi bir satırda kodun excepiton fırlatmasını istersek
        veya kodu başka bir satıra göndermek istersek javada hazır bir excepiton yoksa
        throw keyword'ü ile bu isteğimizi yapabiliriz

         */

        // Bir öğrenciden notunu alıp 50 ve üzeri ise Geçtin
        // 50 altı ise kaldın desin
        // yanlış girerse de uyarı versin

        Scanner scanner = new Scanner(System.in);
        System.out.println("LÜtfen Yıl Sonu Notunuzu giriniz");
        double not= scanner.nextDouble();


        if (not<0 || not>100){
            throw new IllegalArgumentException("GEÇERSİZ NOT GİRİŞİ YAPILDI!");
        } else if (not>50) {
            System.out.println("Geçtiniz!");

        }else {
            System.out.println("Kaldınız!");
        }


    }
}
