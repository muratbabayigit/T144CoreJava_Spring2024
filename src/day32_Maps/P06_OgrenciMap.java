package day32_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_OgrenciMap {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=mapDepo.mapOlustur();


        System.out.println(ogrenciMap.get(106)); // Can-Yılmaz-11-A-SAY

        //System.out.println(ogrenciMap.values());


        //Numarası girilen öğrencinin Alan bilgisini yazdırma

        System.out.println(mapDepo.getBolum(ogrenciMap, 101));

        //Numarası girilen Öğrencinin sınıf bilgisini getirelim
        System.out.println(mapDepo.getSinif(ogrenciMap, 108));


        //Kullanıcı numarayı ve istediği bilgiyi parametre olarak girip istediği bilgileri getirsin
        System.out.println(mapDepo.getData(ogrenciMap,105,"isim"));
        System.out.println("***************************************************************************");


    }
}
