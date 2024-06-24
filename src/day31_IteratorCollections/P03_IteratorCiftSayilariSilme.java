package day31_IteratorCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P03_IteratorCiftSayilariSilme {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>(Arrays.asList(1,5,3,6,7,8,11,12,24,26,25,31,38,42,68,102));
        System.out.println(sayilar); //[1, 5, 3, 6, 7, 8, 11, 12]

        Iterator itr=sayilar.iterator();

        while(itr.hasNext()){
           Integer sayi= (Integer) itr.next();

           if(sayi%2==0){
               itr.remove();
           }
        }
        System.out.println(sayilar);
    }
}
