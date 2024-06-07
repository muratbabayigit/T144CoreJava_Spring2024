package day26_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class P03_Corsa extends P02_Opel{

    P03_Corsa(){

        System.out.println("Corsa Constructor çalıştı");
    }
    /*
    Javada oluşturulan bir obje'ye ilk değer atanmasının yapılabilmesi için
    CONSTRUCTOR çalışıtırlması zorunludur.
    Java kendisini parent'ları olan class'lardaki objelerin özelliklerine
     */
    String model="Corsa";
    String motor="vvt";
    String renk="kırmızı";

    public static void main(String[] args) {


        P03_Corsa corsa1=new P03_Corsa();


        System.out.println(corsa1.model); //Corsa
        System.out.println(corsa1.motor); // vvt
        System.out.println(corsa1.renk); // kırmızı

        System.out.println(corsa1.marka); // Opel
        System.out.println(corsa1.renk); // kırmızı
        System.out.println(corsa1.kasaTipi); // Belirtilmedi
        /*
        Biz constructor çalıştırmadan
        parenttaki variable'lara nasıl ulaşıyoruz

        javada child class'larda bir obje oluşturulduğunda
        parent class'lardaki constructorların otomatik olarak
        çalıştırılması için bir mekanizma oluşturulmuştur.

        java her class için default constructor oluşturduğu gibi
        extends keyword kullanan class!lar için
        her bir constructor'ın ilk satırına super() constructor call koyar

         */


















        List<Integer> liste=new ArrayList<>();
        //String str = new StringBuilder("Murat");
        Integer sayi=10;
        // Double dblSayi=(Integer) sayi;
        // String str2=sayi;
        Object obj=sayi;
        String str="Java";
        obj=str;
        Object obj2=30;
        Integer sayi2= (Integer) obj2;
        //Parenttaki bri datayı cahild'daki bri variable'a atama yapabilirisiniz
        //Fakat child'daki bir datayı parent'daki bir variable'a cast etmelisiniz.

    }
}
