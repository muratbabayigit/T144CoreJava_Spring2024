package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class P05_mapOlusturmak {
    public static void main(String[] args) {

        Map<Integer, String>  ogrenciMap=new HashMap<>();

        //Bir okul sisteminde kayıt edilen öğrencilerin
        // no,isim,soyisim,sınıf,şube,alan bilgileri yer alacak
        // key olarak no alınacak ve benzersiz şekilde atanacak
        // geriye kalan isim,soyisim,sınıf,şube,alan bilgileri ise tek bir value olacak şekilde String yapılacak
        // isim-soyisim-sınıf-şube-alan bilgileri buradaki gibi sıralı ve aynı ayraçla ayrılmış olmalıdır

        ogrenciMap.put(101,"Mustafa-İsmail-11-A-SAY");
        ogrenciMap.put(102,"Murat-Yiğit-11-A-SAY");
        ogrenciMap.put(103,"Serpil-Cem-11-A-SÖZ");
        ogrenciMap.put(104,"Neslihan-Koç-11-A-SAY");
        ogrenciMap.put(105,"Levent-Seflek-11-A-EA");
        ogrenciMap.put(106,"Can-Yılmaz-11-A-SAY");
        ogrenciMap.put(107,"Berk-Yiğit-10-A-SÖZ");



        //Map içindeki öğrencilerin numaralarını yazdıralım

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106, 107]

        //103numaralı öğrencinin bilgilerini yazıralım

        System.out.println(ogrenciMap.get(103)); // Serpil-Cem-11-A-SÖZ

        //Database de kayıtlı tüm bilgileri getirsin

        System.out.println(ogrenciMap.values()); //
        /*
        [ Mustafa-İsmail-11-A-SAY,
        Murat-Yiğit-11-A-SAY,
        Serpil-Cem-11-A-SÖZ,
        Neslihan-Koç-11-A-SAY,
        Levent-Seflek-11-A-EA,
        Can-Yılmaz-11-A-SAY,
        Berk-Yiğit-10-A-SÖZ]
         */


        // 105 numaralı öğrenci var mı?
        System.out.println(ogrenciMap.containsKey(105)); // true


        //İsmi Murat olan öğrenci var mı?
        System.out.println(ogrenciMap.containsValue("Murat")); //false
        System.out.println(ogrenciMap.containsValue("Murat-Yiğit-11-A-SAY")); //true



    }
}
