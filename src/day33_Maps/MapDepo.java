package day33_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDepo {
    public static void main(String[] args) {

    }
    public static Map<Integer, String> mapOlustur() {
    Map<Integer, String> ogrenciMap =new HashMap<>();
        ogrenciMap.put(101,"Mustafa-İsmail-11-A-SAY");
        ogrenciMap.put(102,"Murat-Yiğit-11-K-EA");
        ogrenciMap.put(103,"Serpil-Cem-11-A-SÖZ");
        ogrenciMap.put(104,"Neslihan-Koç-11-A-SAY");
        ogrenciMap.put(105,"Levent-Seflek-11-K-EA");
        ogrenciMap.put(106,"Can-Yılmaz-11-A-SAY");
        ogrenciMap.put(107,"Berk-Yiğit-10-C-SÖZ");
        ogrenciMap.put(108,"Rana-Ülker-12-A-EA");

        return ogrenciMap;
}
    public static String numaraylaBilgiGetirme(Map<Integer, String> ogrenciMap,int ogrNo ){
        String ogrValue=ogrenciMap.get(ogrNo); // Rana-Ülker-12-A-EA
        String [] ogrValueArr=ogrValue.split("-"); // [Rana,Ülker,12,A,EA]

        String isim=ogrValueArr[0];
        String soyisim=ogrValueArr[1];
        String istenenformat=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
                +" "+soyisim.toUpperCase();

        return istenenformat;
    }


    public static void sinifListesiYazdir(Map<Integer, String> ogrenciMap, int sinif) {
        //istenen sınıf türüne ait bilgileri yazdırabilmek için önce
        // tüm bilgileri bir collection içine kaydedelim
        Collection <String> values=ogrenciMap.values();
        int siraNo=1;

        for (String eachValues : values) {
            //Rana-Ülker-12-A-EA

            // her bir döngüde gelen değeri split edelim

            String [] eachvaluesArr=eachValues.split("-");

            // Bu aşamadan sonra oluşan arr içindeki sınıf değeri
            // istenen sınıf degerine eşitse yazdırırız
            // değilse bir sonraki döngüye giderz

            if(eachvaluesArr[2].equals(sinif+"")){
                System.out.println(siraNo+"- "+eachvaluesArr[0]+" "+eachvaluesArr[1]+" "+eachvaluesArr[2]+eachvaluesArr[3]);
                siraNo++;
            }










        }



    }
}
