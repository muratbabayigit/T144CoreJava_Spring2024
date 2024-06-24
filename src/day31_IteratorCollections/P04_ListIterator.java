package day31_IteratorCollections;

import java.util.*;

public class P04_ListIterator {
    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>(Arrays.asList(1,5,3,6,7,8,11,12));
        //List'in tüm elemanlarını toplayarak yazdıralım
        int toplam=0;
        Iterator itr=sayilar.iterator();
        while (itr.hasNext()){
            toplam += (Integer)itr.next();
        }

        System.out.println(toplam);

        /*
            iterator'da dikkat etmemiz gereken en önemli şey
            oluşturulan objenin nerede olduğudur
            yukarıdaki loop'ta itr objesi sırayla ilerleyip en sona gittiği için
            yeni bir işlem yapmak istersem itr objesini yeniden oluşturmam gerekir
            bir başka deyişle sona gitmiş olan itr objesini başa getirmiş olacağız
         */

        itr=sayilar.iterator();

        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(sayilar);

        /*
            Javada Iterator interface'inda 3 adaet method olduğu için
            bazı işlemleri yapmakta zorluk çıkarabilir
            Daha fazla method için Iterator'un child'ı olan
            ListeIterator kullanılır
         */

        List<Integer> sayilar2=new ArrayList<>(Arrays.asList(1,5,3,6,7,8,11,12));

        ListIterator lit=sayilar2.listIterator();
        int toplam2=0;
        while (lit.hasNext()){
            toplam2 += (Integer)lit.next();
        }
        System.out.println(toplam2);


        while(lit.hasPrevious()){
            lit.previous();
            lit.remove();
        }
        System.out.println(sayilar2);



    }
}
