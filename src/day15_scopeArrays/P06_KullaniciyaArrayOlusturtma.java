package day15_scopeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {
        /*
        Kullanıcıdan array'in boyutunu ve elemanlarını alıp
        array'ii oluşturup bize döndüren methodu hazırlayın
         */
        int []arr =arrayOlustur();
        System.out.println("Array: "+Arrays.toString(arr));

    }

    public static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç adet sayı girişi olacak ?: ");
        int arrayBoyutu= scan.nextInt();
        int[] arr=new int[arrayBoyutu];
        System.out.println("Array'in Ham hali: "+Arrays.toString(arr));

        for (int i = 0; i < arrayBoyutu; i++) {
            System.out.print((i+1)+". tam sayıyı giriniz: ");
            arr[i]=scan.nextInt();

        }
        return arr;
    }


}
