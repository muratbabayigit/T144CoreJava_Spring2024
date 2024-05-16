package day11_forLoopMethodCreation;

import day12_Methods.P03_AsalSayiSonucuYazdirma;

import java.util.Scanner;

public class P07_nestedforLoop {
    /*
        Kullanıcıdan bir deger alıp onu desen boyutu yapıp baklava deseni oluşturun
        *
       ***
      *****
     *******
      *****
       ***
        *

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Desen Boyutu Giriniz(Tek Sayı): ");
        int boyut= scan.nextInt();

        if(boyut%2==0){
            System.out.println("Tek Sayı girmelisiniz");
            return;
        }

        int orta=(boyut/2)+1; //baklavanın ortasını bulduk

        //Üst Kısmı yapıyoruz
        for (int i = 1; i <=orta ; i++) {
            for (int j = 1; j <=(orta-i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Alt Kısım
        for (int i = (orta-1); i >= 1 ; i--) {
            for (int j = 1; j <= (orta-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        P03_AsalSayiSonucuYazdirma.asalSayiMiyazdir(25);


    }
}
