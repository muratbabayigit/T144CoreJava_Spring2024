package day31_IteratorCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P02_Iterator {
    public static void main(String[] args) {


        int [] arr={2,3,5,8,9};

        /*
        verilen array'in her bir elemanını 2 arttırarak kaydenin
        */

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=2;
        }

        //System.out.println(Arrays.toString(arr));

        /*
        verilen array'in her bir elemanını index kullanmadan 2 arttırarak kaydenin
        */

        for (int each:arr){
            each+=2;
        }

      //  System.out.println(Arrays.toString(arr));

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(1,5,3,6,7,8,11,12));

        System.out.println(sayilar); //[1, 5, 3, 6, 7, 8, 11, 12]

        // list içindeki çift sayıları siliniz
        Iterator itr= sayilar.iterator();    //      1    5    3    6    7    8    11    12

        System.out.println(itr.hasNext()); // sonrasında bir eleman var mı(true/flase)
        System.out.println(itr.next()); // 1
        System.out.println(itr.hasNext());
        System.out.println(itr.next());//5

        int sayi= (int) itr.next();

        if (sayi%2==0){
            itr.remove();
        }
        System.out.println(sayilar);

        sayi= (int) itr.next();
        if (sayi%2==0){
            itr.remove();
        }
        System.out.println(sayilar);

        sayi= (int) itr.next();
        if (sayi%2==0){
            itr.remove();
        }
        System.out.println(sayilar);

        sayi= (int) itr.next();
        if (sayi%2==0){
            itr.remove();
        }
        System.out.println(sayilar);

        sayi= (int) itr.next();
        if (sayi%2==0){
            itr.remove();
        }
        System.out.println(sayilar);



    }
}
