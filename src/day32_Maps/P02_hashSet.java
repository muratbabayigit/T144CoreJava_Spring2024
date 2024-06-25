package day32_Maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P02_hashSet {
    public static void main(String[] args) {
        Set<Integer> sayilar=new HashSet<>();

        sayilar.add(10);
        sayilar.add(12);
        sayilar.add(25);
        sayilar.add(10);
        sayilar.add(30);
        sayilar.add(12);

        System.out.println(sayilar);// [25, 10, 12, 30]
        int toplam=0;
        //set içindeki çift sayıları toplasın
        for (Integer each : sayilar) {
            if(each%2==0){
                toplam+=each;
            }

        }
        System.out.println(toplam);


        //  sayilar.remove(25);

        // set içindeki tek sayıları silin

     //  for (Integer each : sayilar) {
     //      if(each%2!=0){
     //          sayilar.remove(each);
     //      }

     //  }

        Iterator itr=sayilar.iterator();

        while(itr.hasNext()){
           if ((Integer)itr.next()%2 !=0){
               itr.remove();
           }
        }

        System.out.println(sayilar);


        // set elemanlarının her birini 2 arttırın

        /*
            set index yapısını desteklemddiği için for loop ile yapılamaz
            for each loop kullanırsak değişiklik kaydedilmez
            Iterator kullanırsak değişiklik yapılamaz

            dolayısyla bu işlemi yapabilmek için yeni bir set oluşturup
            sayilar set'inin elmanlarının 2 fazasını yeni set'e ekleyeceğiz

        */

        Set<Integer> temp=new HashSet<>();

        for (Integer each : sayilar) {
            temp.add(each+2);
        }
       // System.out.println(temp);

        sayilar=temp;

        System.out.println(sayilar);


    }
}
