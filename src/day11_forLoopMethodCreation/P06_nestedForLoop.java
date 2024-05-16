package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P06_nestedForLoop {
    public static void main(String[] args) {
 /*
    Kullanicidan satir sayisini alip
    asagidaki sekli olusturun

    *
    * *
    * * *
    * * * *
    * * * * *

 */

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen Satır Sayısını Giriniz: ");
        int satir= scan.nextInt();


        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
