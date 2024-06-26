package day33_Maps;

import java.util.Map;

public class P02_mapUpdateEntrySet {

    public static void main(String[] args) {


        Map<Integer, String> ogrenciMap=MapDepo.mapOlustur();
        System.out.println(ogrenciMap);
        /*
        {
        101=Mustafa-İsmail-11-A-SAY,
        102=Murat-Yiğit-11-K-EA,
        103=Serpil-Cem-11-A-SÖZ,
        104=Neslihan-Koç-11-A-SAY,
        105=Levent-Seflek-11-K-EA,
        106=Can-Yılmaz-11-A-SAY,
        107=Berk-Yiğit-10-C-SÖZ,
        108=Rana-Ülker-12-A-EA}
         */

        ogrenciMap.put(102,"Murat-Babayiğit-12-A-SAY");
        System.out.println(ogrenciMap);
        /*
        {
        101=Mustafa-İsmail-11-A-SAY,
        102=Murat-Babayiğit-12A-SAY,
        03=Serpil-Cem-11-A-SÖZ,
        104=Neslihan-Koç-11-A-SAY,
        105=Levent-Seflek-11-K-EA,
        106=Can-Yılmaz-11-A-SAY,
        107=Berk-Yiğit-10-C-SÖZ,
        108=Rana-Ülker-12-A-EA
        }
         */

        MapDepo.numaraylaBilgiUpdate(ogrenciMap,107,"Babayiğit");
        System.out.println(ogrenciMap);
        /*
        {
        101=Mustafa-İsmail-11-A-SAY,
        102=Murat-Babayiğit-12A-SAY,
        103=Serpil-Cem-11-A-SÖZ,
        104=Neslihan-Koç-11-A-SAY,
        105=Levent-Seflek-11-K-EA,
        106=Can-Yılmaz-11-A-SAY,
        107=Berk-Babayiğit-10-CSÖZ,
        108=Rana-Ülker-12-A-EA
        }
         */


      MapDepo.tumBilgilerleOgrListesiYazdir(ogrenciMap);


        //Yıl sonunda öğrenci sınıflarını 1 arttır
        MapDepo.yilSonuSinifArttir(ogrenciMap);
        System.out.println(ogrenciMap);

    }


}
