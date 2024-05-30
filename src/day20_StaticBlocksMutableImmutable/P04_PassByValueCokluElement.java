package day20_StaticBlocksMutableImmutable;

import java.util.Arrays;

import static day15_scopeArrays.P06_KullaniciyaArrayOlusturtma.arrayOlustur;

public class P04_PassByValueCokluElement {

    /*
    soru:
    verilen bir int array'in her bir elemanının 2 arttırıp
    array'in yeni halini yazdıran bir method oluşturun
     */
    public static void main(String[] args) {
       int [] arr={3,5,7};
       elemanlariArttir(arr);
       System.out.println("Method Call sonrası array :"+Arrays.toString(arr));

       arrayUzat(arr);

       System.out.println("arrayUzat method çalıştıktan sonrası array :"+Arrays.toString(arr));



        /*
        array'in uzunluğundan 1 eleman fazla olan yeni bir array oluşturulaım
        bu array'in tüm elemanları 5 olsun
        sonra bu yeni array'i yolladığımız array'e atayalım
        array'in son halini yazdıran bir method olşturalım
         */

    }

    private static void arrayUzat(int[] arr) {
        int [] yeniArr=new int[arr.length+1];

        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i]=5;
        }
        arr=yeniArr;
        System.out.println("Array'in son hali: "+Arrays.toString(arr));


    }

    public static void elemanlariArttir(int [] arb) {
        for (int i = 0; i < arb.length ; i++) {
            arb[i]+=2;
        }
        System.out.println(Arrays.toString(arb));//[5, 7, 9]
    }
}
