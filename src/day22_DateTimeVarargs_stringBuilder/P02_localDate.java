package day22_DateTimeVarargs_stringBuilder;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class P02_localDate {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);
        LocalDate istenenTarih=LocalDate.of(2005,03,22);
        System.out.println(istenenTarih);

        LocalDate dogumGunu=LocalDate.of(1980,05,07);

        LocalDate istenenUlkeTarihi=LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(istenenUlkeTarihi);

        System.out.println(bugun.getDayOfMonth()); // Ayın 3. Günü
        System.out.println(bugun.getDayOfWeek()); // Haftanın pazartesi günü
        System.out.println(bugun.getDayOfYear());// yılın 155.günü
        System.out.println(bugun.getEra()); //CE milattan sonra
        System.out.println(bugun.getChronology()); //ISO (Pazt-Salı-Çarşamba... biçim ifadesi)

        System.out.println(bugun.plusYears(5).plusMonths(3).plusDays(14));

        System.out.println(bugun.withMonth(10).withYear(2025)); // ay ve yılı biz belirledik
        System.out.println(bugun.isLeapYear()); //artık yıl olup olmadığına bakar
        System.out.println(bugun.lengthOfYear()); // 366 yıldaki gun sayısı
        System.out.println(bugun.withYear(2025).isLeapYear()); //girilen yılın artık yıl olup olmadığına bakar
        System.out.println(bugun.withMonth(7).lengthOfMonth()); // 31 aydaki gun sayısı


        System.out.println(dogumGunu.until(bugun)); //P44Y27D
        System.out.println(dogumGunu.until(bugun).getYears()); //44

        //eger iki tarih arasını bir periyod olarak kaydetmek istersek
        // Period class'ı kullanılır

        Period period=Period.between(dogumGunu,bugun);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());



    }
}
