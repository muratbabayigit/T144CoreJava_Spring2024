package day33_Maps;

import java.util.HashMap;
import java.util.Map;

public class P05_nestedMaps {
    public static void main(String[] args) {

    /*
        ogrenciMap.put(101,"Mustafa-İsmail-11-A-SAY");
        ogrenciMap.put(102,"Murat-Yiğit-11-K-EA");
        ogrenciMap.put(103,"Serpil-Cem-11-A-SÖZ");
        ogrenciMap.put(104,"Neslihan-Koç-11-A-SAY");
        ogrenciMap.put(109,"İsmail-Kaya-Mezun-B-EA");

        burada map içine veri eklerken tek bir satırda
        key,value ikilisi ile veri akleyebiliyoruz

        birden fazla veriyi eklemek gerekirse burada nestedMap kullanılabilir

        ogrenci={
                    101={ogrenci1 bilgileri},
                    102={ogrencibilgileri2},
                    103="Serpil-Cem-11-A-SÖZ",

                 }
     */


        Map<Integer, Map<String,String>> ogrenciMap = new HashMap<>();


        Map<String,String> ogrenci1= new HashMap<>();
        ogrenci1.put("isim","Murat");
        ogrenci1.put("soyisim","Koç");
        ogrenci1.put("sinif","9");
        ogrenci1.put("sube","B");
        ogrenci1.put("alan","Say");



        Map<String,String> ogrenci3= new HashMap<>();
        ogrenci3.put("isim","Ali");
        ogrenci3.put("soyisim","Koç");
        ogrenci3.put("sinif","12");
        ogrenci3.put("sube","B");
        ogrenci3.put("alan","Say");

        Map<String,String> ogrenci2= new HashMap<>();
        ogrenci2.put("isim","Dursun");
        ogrenci2.put("soyisim","Koç");
        ogrenci2.put("sinif","10");
        ogrenci2.put("sube","B");
        ogrenci2.put("alan","EA");

        ogrenciMap.put(103,ogrenci3);
        ogrenciMap.put(101,ogrenci1);
        ogrenciMap.put(102,ogrenci2);


        System.out.println(ogrenciMap);


        /*
                {
                    101={sinif=9, sube=B, alan=Say, soyisim=Koç, isim=Murat},
                    102={sinif=10, sube=B, alan=EA, soyisim=Koç, isim=Dursun},
                    103={sinif=12, sube=B, alan=Say, soyisim=Koç, isim=Ali}
                }

         */


    }
}
