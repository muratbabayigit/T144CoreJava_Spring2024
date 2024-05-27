package day16_ArraysMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class P09_ArrayListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar); // []

        //bir listin eleman sayısını bulmak için kullanılan methode .size()
        System.out.println(sayilar.size());// 0

        //Bil List'in dolu mu boş mu olduğunu .isEmpty() ile kontrol ederiz
        System.out.println(sayilar.isEmpty()); //true

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(23);
        sayilar.add(108);
        sayilar.add(541);

        System.out.println(sayilar);  // [1,3,23,108,541]
        System.out.println(sayilar.size()); // 5
        System.out.println(sayilar.isEmpty()); // false

        //List içinde bir eleman varmı diye bakmak için .contains() kullanılır

        System.out.println(sayilar.contains(3)); //true
        System.out.println(sayilar.contains(23)); //true
        System.out.println(sayilar.contains(33)); //false

        //List içindeki herhangi bir elemanı kullanmak için .get() methodu kullanılır
        System.out.println(sayilar.get(0));  //1
        int kullanic3No= sayilar.get(2);
        System.out.println("kullanic3No = " + kullanic3No); //23

        //List elemanlarında herhangi birini silmek isterseniz  .remove() methodu kullanılır
        // onun ya index numarasını () içine girmeniz ya da önce vir variable wrapper class ile ekleyip
        // sonra o variable'ı silmelisiniz

        Integer k1=23;
        sayilar.remove(k1);
        System.out.println(sayilar);

        System.out.println(sayilar.remove(0));

        List <String> kelimeler= new ArrayList<>();
        kelimeler.add("Sakla");
        kelimeler.add("samanı");
        kelimeler.add("gelir");
        kelimeler.add("Zamanı");

        System.out.println(kelimeler);
        kelimeler.remove("samanı");
        System.out.println(kelimeler.remove(1));
        System.out.println(kelimeler);

        System.out.println("kelimelerin boyutu = " + kelimeler.size()); //2
        System.out.println("Sayıların Boyutu: "+sayilar.size());//3

        kelimeler.clear(); //içriği toptan siler
        System.out.println(kelimeler.size());
        System.out.println(kelimeler);

        kelimeler.add("Murat");  //index:0
        kelimeler.add("Levent"); //index:1
        kelimeler.add("Fatma");  //index:2
        kelimeler.add("Rana");   //index:3
        kelimeler.add("Murat");  //index:4
        kelimeler.add("Mustafa"); //index:5

        //bir elementin hangi indexte olduğunu anlamak için indexOf() ve lastimdexOf() kullanılır

        System.out.println(kelimeler.indexOf("Murat"));   // 0
        System.out.println(kelimeler.lastIndexOf("Murat")); //4
        System.out.println(kelimeler.indexOf("Rana")); // 3
        System.out.println(kelimeler.lastIndexOf("Rana")); //3

        //list'in bir bölümünü almak için subList() methodu ile yapılır.
        System.out.println(kelimeler.subList(1,3));  //index'i 1'den 3'e kadar olanlar









    }
}
