package day16_ArraysMultidimensionalArrays;

public class P07_innerArraylerinSonElemanlariniToplama {

    public static void main(String[] args) {

        //Soru:Verilen 2 katli bir array’de bulunan inner arraylerin son elemenlarını toplayip,
        //        sonucu yazdiran bir method olusturun.

        int[][] arr = {{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};

        sonElemanlariTopla(arr);


    }

    private static void sonElemanlariTopla(int[][] arr) {
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i][arr[i].length-1];
        }
        System.out.println("Son Elemanların Toplamı: "+toplam);
    }


}
