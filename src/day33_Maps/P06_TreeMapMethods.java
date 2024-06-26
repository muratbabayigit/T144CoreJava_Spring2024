package day33_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P06_TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> ogrenciMap =new TreeMap<>();
        ogrenciMap.put(101,"Mustafa-İsmail-11-A-SAY");
        ogrenciMap.put(106,"Can-Yılmaz-11-A-SAY");
        ogrenciMap.put(109,"İsmail-Kaya-Mezun-B-EA");
        ogrenciMap.put(108,"Rana-Ülker-12-A-EA");
        ogrenciMap.put(104,"Neslihan-Koç-11-A-SAY");
        ogrenciMap.put(105,"Levent-Seflek-11-K-EA");
        ogrenciMap.put(103,"Serpil-Cem-11-A-SÖZ");
        ogrenciMap.put(107,"Berk-Yiğit-10-C-SÖZ");
        ogrenciMap.put(102,"Murat-Yiğit-11-K-EA");


        System.out.println(ogrenciMap);
        //{101=Mustafa-İsmail-11-A-SAY, 102=Murat-Yiğit-11-K-EA, 103=Serpil-Cem-11-A-SÖZ, 104=Neslihan-Koç-11-A-SAY, 105=Levent-Seflek-11-K-EA, 106=Can-Yılmaz-11-A-SAY, 107=Berk-Yiğit-10-C-SÖZ, 108=Rana-Ülker-12-A-EA, 109=İsmail-Kaya-Mezun-B-EA}

        System.out.println(ogrenciMap.subMap(101, 105));
        System.out.println(ogrenciMap.subMap(104,109));
        System.out.println(ogrenciMap.subMap(105, false, 109, true));


        System.out.println(ogrenciMap.descendingMap()); //sondan başa sıralı yazdırır
        System.out.println(ogrenciMap.ceilingKey(105));
        System.out.println(ogrenciMap.ceilingEntry(100));
        System.out.println(ogrenciMap.ceilingEntry(102));
        System.out.println(ogrenciMap.floorEntry(110));
        System.out.println(ogrenciMap.floorEntry(106));
        System.out.println(ogrenciMap.size());


    }
}
