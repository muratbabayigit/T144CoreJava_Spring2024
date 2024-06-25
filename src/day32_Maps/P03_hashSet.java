package day32_Maps;

import java.util.Arrays;
import java.util.HashSet;

public class P03_hashSet {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 5, 7, 2, 6, 3, 9, 11, 1, 25, 3, 6, 4, 8};

        //Verilen array'in tekrar eden elemanlarını silip tekrarsız array oluşturun

        HashSet<Integer> tekrarsizArray = new HashSet<>();

        for (int each : arr) {
            tekrarsizArray.add(each);
        }
        System.out.println(tekrarsizArray);

        // arr=tekrarsizArray;

        arr = new int[tekrarsizArray.size()];

        //hashSet index yapısını desteklmediği için kenidmiz index yapısı kurabilir

        int index = 0;

        for (Integer each : tekrarsizArray) {
            arr[index] = each;
            index++;
        }
        System.out.println("Tekrar eden elemanları silinmiş array: " + Arrays.toString(arr));

    }
}
