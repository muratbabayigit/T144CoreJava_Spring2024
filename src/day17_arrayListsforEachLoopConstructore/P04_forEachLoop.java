package day17_arrayListsforEachLoopConstructore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P04_forEachLoop {

    /*Verilen bir array’de tekrar eden elementler icin,
     mukerrer olanlari silip, tum elemanlardan  sadece 1 tane yapip
     bize dondurecek bir method olusturun.
     */

    public static void main(String[] args) {

        Integer [] arr={2,3,1,5,12,2,1,3,4,6,8,7,4,6,1,5,3,6,9,8,1,2,4,5,6,3,7,8,1235};

        List<Integer> tekrarsizList=new ArrayList<>();
        //tekil olan ya da tekrar eden elemanlardan sadece bşr tanesini alan bir list

        for (Integer each:arr){
            if(!tekrarsizList.contains(each)){
                tekrarsizList.add(each);
            }
        }
        System.out.println("Tekrarsiz List: "+tekrarsizList);
        //Tekrarsiz List: [2, 3, 1, 5, 12, 4, 6, 8, 7, 9, 1235]

        arr=new Integer[tekrarsizList.size()];

        System.out.println(Arrays.toString(arr));
        //[null, null, null, null, null, null, null, null, null, null, null]

        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsizList.get(i);
        }

        System.out.println(Arrays.toString(arr));



    }

}
