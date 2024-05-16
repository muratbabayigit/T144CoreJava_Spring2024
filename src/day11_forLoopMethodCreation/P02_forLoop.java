package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir String isteyin ve
        String’i tersten yazdirin.
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen Bir Cümle Giriniz: ");
        String cumle=scan.nextLine();
        String tersCumle="";

        /*
        java ne güzel bir dil
        lid rib lezüg en avaj
         */

        for (int i = cumle.length(); i >=1 ; i--) {
            tersCumle+=cumle.substring(i-1,i);
        }
        System.out.println(tersCumle);
    }
}
