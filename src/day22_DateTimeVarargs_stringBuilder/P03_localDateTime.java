package day22_DateTimeVarargs_stringBuilder;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P03_localDateTime {

    public static void main(String[] args) {
        LocalDateTime suAn=LocalDateTime.now();
        System.out.println(suAn);

    // Tarih formatını istersem kendim düzenleyebilirim
    // Bunun için DateTimeFormatter class'ını kullanırız

        DateTimeFormatter format1=DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(suAn.format(format1)); //20240603

/*
        İstedğimizz gibi bir tarih zamman formatı yapmak için

             GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati
                 m : dakika ifade eder

                 a yazarsak AM veya PM degerini yazar
         */

        //  03/06/2024
        DateTimeFormatter format2= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(suAn.format(format2));

        //  03.06.2024
        DateTimeFormatter format3= DateTimeFormatter.ofPattern("d.M.yyyy EEEE");
        System.out.println(suAn.format(format3));

        //  03.06.2024
        DateTimeFormatter format4= DateTimeFormatter.ofPattern("d.M.yyyy EEEE h:mm a");
        System.out.println(suAn.format(format4));


    }
}
