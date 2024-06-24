package day31_IteratorCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P10_Soru {
    public static void main(String[] args) {
        /*
        Kullanicidan deger alarak iki String liste olusturun.
        Kullanici deger girmeyi birakmak icin 0’a basmalidir.
	    Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
		liste1 : …….
		liste2 : …….
		ortak elementler : …….

         */

        System.out.println("Birinci Liste için metin girişi...");
        List<String> list1 = listOlustur();
        System.out.println("İlk Liste: "+ list1);

        System.out.println("İkinci Liste için metin girişi");
        List<String> list2 = listOlustur();
        System.out.println("İkinci Liste: "+ list2);

        list1.retainAll(list2); //ortak elemanları tutup farklı elemanları siliyor
        System.out.println("Ortak Elemanlar: "+list2);

    }

    public static List<String> listOlustur() {

        List<String> isimList = new LinkedList<>();
        Scanner scan=new Scanner(System.in);
        String input="";

        while(!input.equals("0")){
            System.out.println("Lütfen listeye eklemek için metin giriniz: \nBitirmek için 0 tuşuna basınız");
            input = scan.nextLine();

            if (!input.equals("0")){
                isimList.add(input);
            }

        }
        return isimList;

    }
}
