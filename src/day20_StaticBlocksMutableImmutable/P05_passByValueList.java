package day20_StaticBlocksMutableImmutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class P05_passByValueList {
    /*
    Java da tek değer atanan int double String gibi data türlerini
    methoda yolladığımızda
    method işlem yapıp değişiklik oluşturursa
    bu değişikliklik methodda kalır
    ta ki main methodda atama yapana kadar
    atama yapılmadıkça main methoddaki orjinal variable değişmez
    methodda değişiklik yapılmazsa kalıcı olmaz

    PassByValue Array gibi List gibi çoklu eleman barındıran yapılarda
    biraz farklı davranız(araba örneği)

    methoda coklu eleman barındıran array ya da list yollarsak
    method içinde yeni bir array yada yeni bir list atanırsa
    o değişiklik sadece method için geçerlidir.
    Java o değişiklik main method için kabul etmez
    (araba değişirse java eski arabayı ister)

    ama method sadece gönderilen arrayin
    elemanlarını değiştirir ve geri döndürürse
    java bu değişkliği kabul eder
    ( arabam aynı gelsin de ister levent ister mustafa getirsin)
    */
    public static void main(String[] args) {

     List<Integer> sayilar = new ArrayList<>(Arrays.asList(3, 5, 9, 12, 35, 64));
     System.out.println(sayilar);//[3, 5, 9, 12, 35, 64]

        /*
        Array'e eleman olarak 100 ekleyip bize dödndüren bir method yazınız
         */
        elemanEkle(sayilar);
      //  System.out.println("yeni eleman eklenen hali ile array: "+sayilar);

        //verilen listteki 2.indexte yer alan elemanı silip bize donduren methodu yazınız
        elemanSil(sayilar);
        //System.out.println(" eleman silinen hali ile  array: "+sayilar);

        // verilen listeye eşt sayıda eleman içerecek şekilde bir list oluşturup
        // eski listeye  yeni oluşturulan list'i atayıp
        // ilk listin son halini bize yazdiran bir method oluşturun

        yeniListOlustur(sayilar);
        System.out.println("Random list atandıktan sonra sayılar listi:"+sayilar);



}

    public static void yeniListOlustur(List<Integer> sayilar) {
        System.out.println(sayilar);
        List<Integer> randomList=new ArrayList<>();
        Random random=new Random();

        for (int i = 0; i < sayilar.size(); i++) {
            randomList.add(random.nextInt(100));

        }
        sayilar=randomList;

        System.out.println("Random list atandıktan sonra sayılar listi:"+sayilar);
        //Random list atandıktan sonra sayılar listi:[0, 90, 27, 46, 39, 20]

    }


    public static void elemanSil(List<Integer> sayilar) {

        sayilar.remove(2);
        System.out.println(" eleman silinen hali ile array: "+sayilar);//[3, 5, 12, 35, 64, 100]

    }

    public static void elemanEkle(List<Integer> sayilar) {
        sayilar.add(100);

        System.out.println("yeni eleman eklenen hali ile array: "+sayilar);
        //yeni eleman eklenen hali ile array: [3, 5, 9, 12, 35, 64, 100]
    }





}
