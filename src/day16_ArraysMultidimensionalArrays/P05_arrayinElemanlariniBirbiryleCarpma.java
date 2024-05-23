package day16_ArraysMultidimensionalArrays;

public class P05_arrayinElemanlariniBirbiryleCarpma {
    public static void main(String[] args) {
        // Soru : Verilen 2 katli bir array’de
        //        bulunan tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr = {{3, 5, 6}, {1, 8, 2, 3, 4, 2}, {1, 8, 5, 4}};
        System.out.println(tumElemanlariCapma(arr));


    }

    public static int tumElemanlariCapma(int[][] arr) {
        int sayilarinCarpimi = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sayilarinCarpimi *= arr[i][j];
            }
        }
        return sayilarinCarpimi;
    }
}
