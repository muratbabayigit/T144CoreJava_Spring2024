package day14_doWhileLoopClassVariable;

import java.util.Scanner;

public class P01_WhileLoops {
    /*
    While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz:");
        int sayi= scan.nextInt();
        int rakamlartoplam=0;
        while (sayi>0){
            rakamlartoplam+=sayi%10; //Her bir döngüde birler basamağındaki sayıyı rakamlartoplamına ekleyecek
            sayi/=10;//sayıyı 10'e bölerek bir sonraki basamağı birler basmağı haline getirecek
        }
        System.out.println("Girilen sayının rakamlar toplamı: "+rakamlartoplam);


    }


}
