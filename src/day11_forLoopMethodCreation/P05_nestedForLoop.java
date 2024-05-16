package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P05_nestedForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan satır ve sütun sayısını alıp

        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *

        şeklini yazdırın
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Satır Sayısı: ");
        int satir= scan.nextInt();
        System.out.print("Sütun Sayısı: ");
        int stun= scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <stun ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
