package day17_arrayListsforEachLoopConstructore;

import java.util.ArrayList;
import java.util.List;

public class P05_ortakElemanlariyazdirma {

    /*
    Verilen iki array’in elementlerini karsilastirip,
    ikisinde ortak olan elementleri ayri bir liste olarak
    veren bir program yazin.
     */

    public static void main(String[] args) {

        int [] arr1={1,2,5,6,7,8,12,16,65,26,39,28,35,1,36};
        int [] arr2={1,2,3,6,7,8,11,36,65,23,5,30,32,1,45};

        List<Integer> ortakElementler=new ArrayList<>();

        for (int each1:arr1){
            for ( int each2 :arr2){

                if(each1==each2 && !ortakElementler.contains(each1)){
                    ortakElementler.add(each1);
                }

            }
        }
        System.out.println("Ortak elemanlar: "+ortakElementler);

    }
}
