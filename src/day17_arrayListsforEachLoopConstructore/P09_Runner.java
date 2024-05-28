package day17_arrayListsforEachLoopConstructore;

import java.util.Scanner;

public class P09_Runner {
    public static void main(String[] args) {

        /*

         P08_Okul       ogr1      =            new       P08_Okul();
         Class Ismi    obje    aassignment  keyword     Constructor
         Data türü     ismi       sign

         */

        /*
        Biz bir classtan obje oluşturduğumuzda
        o objenin oluşturulduğu class'taki
        tüm variable ve method'ların
        bir kopyasını da oluşturmuş oluruz.

        dolaysıyla sadece variable ve methodlara ulaşmakla kalmaz
        o class'ta atanmış olan değerlere de sahip olur

        java'da bir obje oluşturduğumuzda
        objenin oluşturulduğu class'taki consrtuctor çalışır
        Constructor çalışınca oluşturulan objeye
        ilk değerlerini atıyor(initialize)

        Biz bir class oluşturunca herhengi bi constructor görmüyoruz.
        Fakat bir değer ataması yapabilmek için constructor çalıştıırılması zorunludur.
        Java bunu bildiği için her class olutrduğumuzda bir DEFAULT constructor'ı gizli olarak oluşturuyor
        Biz eğer kendimiz bir parametresiz constructor oluturusak default siliniyor



         */


        P08_Okul ogr1=new P08_Okul();
        ogr1.ogretmenAd="Murat";
        ogr1.ogretmenBrans="Fizik";
        System.out.println(ogr1.ogretmenAd);
        System.out.println(ogr1.ogretmenBrans);
        System.out.println(ogr1.ogretmenYas);
        System.out.println(ogr1.ogretmenSicilNo);


        P08_Okul ogr2=new P08_Okul();
        ogr2.ogretmenAd="Levent";
        ogr2.ogretmenBrans="Core Java";

        P08_Okul pers1=new P08_Okul();
        pers1.personelAd="Tarık";
    }
}
