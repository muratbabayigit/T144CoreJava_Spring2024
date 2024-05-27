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
