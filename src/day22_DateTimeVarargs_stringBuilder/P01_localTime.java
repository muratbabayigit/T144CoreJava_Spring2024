package day22_DateTimeVarargs_stringBuilder;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class P01_localTime {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalTime istenenSaat=LocalTime.of(21,15);
        System.out.println(istenenSaat);
        LocalTime istenenUlkeSaati=LocalTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(istenenUlkeSaati);

        //Bir işlemin ne kadar sürdüğüğnü bulmak için başlangıç ve bitiş zamanlarını kaydedebilirz

        LocalTime baslangic=LocalTime.now(); //Başlarken zamanı kayıt ediyor

        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 2; k++) {

                }
            }
        }
        LocalTime bitis=LocalTime.now(); //İşlem bitince zamanı kaydediyor

        //iki zaman arası farkı bulalım
        System.out.println((bitis.toSecondOfDay() - baslangic.toSecondOfDay()));// Başlangıç ile bitiş arasındaki saniye farkı
        System.out.println(bitis.toNanoOfDay()-baslangic.toNanoOfDay()); // Başlangıç ile bitiş arasındaki nanosaniye farkı

        System.out.println(baslangic.until(bitis, ChronoUnit.SECONDS));
        System.out.println(baslangic.until(bitis, ChronoUnit.NANOS));

        System.out.println(time.getHour()); //11
        // 11.01
        System.out.println(time.getHour()+"."+ time.getMinute()+"."+ time.getSecond());




    }
}
