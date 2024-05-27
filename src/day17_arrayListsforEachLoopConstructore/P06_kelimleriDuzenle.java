package day17_arrayListsforEachLoopConstructore;

import java.util.ArrayList;
import java.util.List;

public class P06_kelimleriDuzenle {
    /*
    Verilen String bir array’deki her bir elementi kontrol edip,
	- Kelimenin uzunlugu cift sayi ise ilk yarisini
	- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
	yeni bir listeye ekleyip yazdirin.
     */

    public static void main(String[] args) {
         String [] isimler={"Arzuv","Can","Fatma Demir Mese","Merve Nur","İsmail","Neslihan","Abdurrahman"};
         List<String> duzenlenmisIsimler=new ArrayList<>();

        for (String each:isimler){
            if (each.length()%2==0){ //çift sayı kontrolu
                duzenlenmisIsimler.add(each.substring(0,each.length()/2));
            }else{ //çift değilse tektir
                duzenlenmisIsimler.add(each.substring(each.length()/2));
        }


    }
        System.out.println(duzenlenmisIsimler);
}
}
