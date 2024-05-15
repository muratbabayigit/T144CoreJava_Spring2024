package day10_StringManipulationForLoop;

import java.util.Scanner;

public class P07_forLoop {
    public static void main(String[] args) {
        /*
         Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri baslangic degerinden kucukse,
         uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Başlangıç değeri giriniz: ");
        int basDeg= scan.nextInt();
        System.out.print("Bitiş değeri giriniz: ");
        int bitDeg=scan.nextInt();

        int toplam=0;

        if (bitDeg<basDeg){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");
        }else{
            for (int i = basDeg; i <=bitDeg ; i++) {
                toplam+=i;

            }
            System.out.println(toplam);
        }



    }
}
