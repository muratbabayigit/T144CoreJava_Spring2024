package day12_Methods;

import java.util.Scanner;

public class P03_AsalSayiSonucuYazdirma {

    public static void main(String[] args) {
       /*
       Kullanıcıdan alınan sayının asal sayı olup olmadığını kontrol edip,
       sonuc olarak Girilen "Sayı Asal Sayıdır" veya Girilen Sayı Asal Sayı Değildir",
       şekinde yazdıran bir method oluşturun

       NOT: Kendisinden ve 1'den başka sayıya bölünemeyen sayıya asal sayı denir
       2,3,5,7,11,13,17,19,23,29....
       Koşul 1: sayi%sayi==0
       Koşul 2: !(Sayi%i==0)

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol edeceğiniz sayıyı giriniz: ");
        int sayi= scan.nextInt();
        asalSayiMiyazdir(sayi);

    }

    public static void asalSayiMiyazdir(int sayi) {
        for (int i = 2; i <=sayi ; i++) {
           if(i == sayi){
               System.out.println("Girilen sayı Asal Sayıdır");
           }else if(sayi%i==0){
               System.out.println("Girilen Sayı Asal Sayı değildir");
           }




        }


    }


}
