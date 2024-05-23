package day16_ArraysMultidimensionalArrays;

import day15_scopeArrays.P08_ElemanSayisiniBulma;

import java.util.Arrays;

public class P02_ArrayElemanlariniSiralama {
    public static void main(String[] args) {

        int [] intArr={2,12,3,8,25,136,41,9,17};
        String [] strArr={"Murat","Zeynep","Ali","Veli","Buse","Kasım","cüneyt","Galip","Mustafa"};

        // bize verilen bir array2in elemanlarını sıralamak için sort() metodu kullanılır

        System.out.println("intArr ilk hali: "+Arrays.toString(intArr));
        Arrays.sort(intArr);
        //sort metodu naturel bir sıralama yapar digit karakterleri küçükten büyüğe doğru sıralama yapar
        System.out.println("intArr sıralı hali: "+Arrays.toString(intArr));
        System.out.println("--------------------------------------------------");
        System.out.println("strArr ilk hali: "+Arrays.toString(strArr));
        //metin içeren arraylerde ascii karakterlerine karşılık gelen sayılara bakarak sıralama yapar
        //intArr sıralı hali: [1, 3, 8, 9, 12, 17, 25, 41, 136]

        Arrays.sort(strArr);
        System.out.println("strArr sıralı hali: "+Arrays.toString(strArr));
        //strArr sıralı hali: [Ali, Buse, Galip, Kasım, Murat, Mustafa, Zeynep, cüneyt]
        //sıralamayı ascii değerine göre yapar

        P08_ElemanSayisiniBulma.elemanSayisiniYazdir(intArr,136);
        //Aradığınız eleman olan 136, verilen array'de 1 adet vardır
        P08_ElemanSayisiniBulma.elemanSayisiniYazdir(intArr,325);
        //Aranan Eleman veilen array'de bulunmamaktadır.


        //intArr sıralı hali: [2, 3, 8, 9, 12, 17, 25, 41, 136]

        System.out.println(Arrays.binarySearch(intArr,136)); //8.indexte dedi

        System.out.println(Arrays.binarySearch(intArr,13));  // -6
        System.out.println(Arrays.binarySearch(intArr,1));  // -1
        System.out.println(Arrays.binarySearch(intArr,24));  // -7

        System.out.println(Arrays.binarySearch(strArr,"Murat")); // 4
        System.out.println(Arrays.binarySearch(strArr,"Veli")); // 6
        System.out.println(Arrays.binarySearch(strArr,"ayşe")); // -9


        int [] arr1={2,12,3,8,25,136,41,9,17};
        int [] arr2={2,12,3,8,25,136,41,9,17};

        System.out.println(Arrays.equals(arr1,arr2));; //

    }
}
