package day32_Maps;

import javax.management.ListenerNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class mapDepo {
   public static Map<Integer, String> mapOlustur() {

        Map<Integer, String> ogrenciMap =new HashMap<>();
        ogrenciMap.put(101,"Mustafa-İsmail-11-A-SAY");
        ogrenciMap.put(102,"Murat-Yiğit-11-A-SAY");
        ogrenciMap.put(103,"Serpil-Cem-11-A-SÖZ");
        ogrenciMap.put(104,"Neslihan-Koç-11-A-SAY");
        ogrenciMap.put(105,"Levent-Seflek-11-A-EA");
        ogrenciMap.put(106,"Can-Yılmaz-11-A-SAY");
        ogrenciMap.put(107,"Berk-Yiğit-10-A-SÖZ");
        ogrenciMap.put(108,"Rana-Ülker-12-A-EA");

        return ogrenciMap;
    }
    public static String getBolum(Map<Integer, String> ogrenciMap, int istenenNo){

     String bilgi = ogrenciMap.get(istenenNo); //107 ise ----> Berk-Yiğit-10-A-SÖZ

     String [] arr= bilgi.split("-");// [Berk,Yiğit,10,A,SÖZ]

     return arr[4];
    }

   public static String getSinif(Map<Integer, String> ogrenciMap, int istenenNo){

       String bilgi = mapOlustur().get(istenenNo); // Rana-Ülker-12-A-EA
       String [] arr= bilgi.split("-"); // [Rana,Ülker,12,A,EA]
        return arr[2];
    }

   public static String getData(Map<Integer, String> ogrenciMap, int istenenNo, String istenenBilgi){
       //Ogrenci Map2inde yer alan bilgileri
       //istenen numaradaki olanları
       //İsim, Soyisim, Sınıf, Şube, Alan şeklinde getirsin

       String istenenOgrValue=ogrenciMap.get(istenenNo); //Rana,Ülker,12,A,EA
       String [] istenenOgrArr=istenenOgrValue.split("-");// [Rana,Ülker,12,A,EA]

       switch (istenenBilgi.toUpperCase()){
           case "AD":
               return istenenOgrArr[0];
           case "SOYAD":
               return istenenOgrArr[1];
           case "SINIF":
               return istenenOgrArr[2];
           case "ŞUBE":
               return istenenOgrArr[3];
           case "ALAN":
               return istenenOgrArr[4];
           default:
               return "Aranan bilgi kayıtlarda mevcut değildir...";
       }

   }
}
