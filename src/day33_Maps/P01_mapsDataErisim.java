package day33_Maps;

import java.util.Map;

public class P01_mapsDataErisim {
    public static void main(String[] args) {


        Map<Integer, String> ogrenciMap=MapDepo.mapOlustur();

        // System.out.println(ogrenciMap);
        
        
        //Öğrenci numarası girerek öğrencinin adını ve soyadını aşağıdaki formatta yazdırın
        //  Mustafa İSMAİL


        System.out.println(MapDepo.numaraylaBilgiGetirme(ogrenciMap, 103));
        System.out.println(MapDepo.numaraylaBilgiGetirme(ogrenciMap, 105));


        // Kullanıcı tarafından girilen sınıf türündeki öğrenci listesini yazdırın

        MapDepo.sinifListesiYazdir(ogrenciMap,12);

    }


}
