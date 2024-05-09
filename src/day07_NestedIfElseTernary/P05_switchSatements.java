package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P05_switchSatements {
    public static void main(String[] args) {
        /* Soru:
                Kullnıcıya haftanın kaçıncı gününde olduğunu sorup
                O günün ismini yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bugün Haftanın Kaçıncı Günündeyiz: ");
        int dayNumber = scan.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Haftada 7 gün vardır. Yanlış bir değer girdiniz!");


        }

    }
}
