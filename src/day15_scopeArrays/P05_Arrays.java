package day15_scopeArrays;

import java.util.Arrays;

public class P05_Arrays {
    public static void main(String[] args) {


    //verilen bir int arraydeki elemanları toplayıp toplmaı yazdırın

    int[]arr={15,23,65,98,17,35,46};
    int toplam=0;


        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Toplam ="+toplam);

        //array'deki tüm elmanların değerini 5 azalt

        for (int i = 0; i < arr.length; i++) {
            arr[i]-=5;
        }
        System.out.println(Arrays.toString(arr));//[10, 18, 60, 93, 12, 30, 41]

        //verilen arraydeki elemanlardan 15'dan büyük olanları 10 azalsın
        //15'den küçük olanları da 2 arttırsın

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>15){
                arr[i]-=10;
            }else{
                arr[i]+=2;
            }

        }
        System.out.println(Arrays.toString(arr)); //[12, 8, 50, 83, 14, 20, 31]



}
}