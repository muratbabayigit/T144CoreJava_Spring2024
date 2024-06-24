package day31_IteratorCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class P05_ListeIterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(1,5,3,6,7,8,11,12));
        ListIterator lit=sayilar.listIterator();
        System.out.println(sayilar);
        //Index kullanamdan her bir elemanının 2 arttırın

        while(lit.hasNext()){
            lit.set((Integer)lit.next()+2);
        }
        System.out.println(sayilar);

        lit=sayilar.listIterator();
        while (lit.hasNext()){
            lit.add((Integer)lit.next()+1);
        }
        System.out.println(sayilar);


    }
}
