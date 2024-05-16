package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P04_nestedForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan kaç satır olmasını istediğini alıp
        aşşağıdaki formatta sayıları yazdırın

        örn sayı:5
        1 2 3 4 5
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25
        ............
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Tablonun sütun sayısını giriniz: ");
        int sutun = scan.nextInt();
        System.out.print("Tablonun satır sayısını giriniz: " )  ;
        int satir = scan.nextInt();
       // for (int i = 1; i <=sayi ; i++) {
       //     System.out.print(i*1+" ");
       // }
       // System.out.println();
       // for (int i = 1; i <=sayi ; i++) {
       //     System.out.print(i*2+" ");
       // }
       // System.out.println();
       // for (int i = 1; i <=sayi ; i++) {
       //     System.out.print(i*3+" ");
       // }
       // System.out.println();
       // for (int i = 1; i <=sayi ; i++) {
       //     System.out.print(i*4+" ");
       // }

        for (int i = 1; i <=satir; i++) { //dıştaki loop satır sayısnı kontrol eder
            for (int j = 1; j <=sutun ; j++) { //içteki loopher satordaki sütunları kontrol eder
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
