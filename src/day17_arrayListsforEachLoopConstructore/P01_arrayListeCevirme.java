package day17_arrayListsforEachLoopConstructore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_arrayListeCevirme {
    public static void main(String[] args) {
        Integer [] arr={3,4,5,6,2,1,8,7,9,12,45,68,96,75,23};
        // Array olarak verilen arr'yi liste çevirmek istiyoruz
        // bu 3 farklı yolla yapılabilir

        //1- forLoop ile

        List<Integer> listARR=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            listARR.add(arr[i]);
        }

        System.out.println("1.list: "+listARR); //[3, 4, 5, 6, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23]

        listARR.add(20);
        listARR.remove(3);
        System.out.println("1.işlem sonucu: "+listARR); //[3, 4, 5, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23, 20]

        //2 -asList() methodu ile
        //arry ellemanlarını bu myhod ile tek etk ekleterek


        List<Integer> listArr2=new ArrayList<>(Arrays.asList(3,4,5,6,2,1,8,7,9,12,45,68,96,75,23));

        System.out.println("2.list: "+listArr2); //[3, 4, 5, 6, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23]

        listArr2.add(20);
        listArr2.remove(3);
        System.out.println("2.işlem sonucu: "+listArr2);

        //3-direkt arr'yi .asList(arr) methoduyla liste çevirmek
            // Ancak burada iki dexavantaj vardır
            //  -bu şekilde yapılırsa .add ve .remove kullanılamaz. Kulanılırsa RTE verir
            //  -java array ile array list'i özdeşleştirir ve birinde yapılan değişiklik diğerini etkiler

        List<Integer> listArr3 = Arrays.asList(arr);

        System.out.println("3.list: "+listArr3);

        // listArr3.add(20); UnsupportedOperationException
      //  listArr3.remove(3); UnsupportedOperationException
        System.out.println("3.işlem sonucu: "+listArr3);

        arr[8]=1258;
        System.out.println("arr değişince onu kullanark oluşturulan list de değişir\n"+listArr3);

    }
}
