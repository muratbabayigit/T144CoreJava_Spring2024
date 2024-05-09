package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P06_SwitchStatements {
    public static void main(String[] args) {
        //// Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
        // I : International
        // S : Software
        // T : Testing
        // Q : Qualifications
        // B: Board

        Scanner scan=new Scanner(System.in);
        System.out.print("ISTQB kelimesinde anlamını merak ettiğiniz harfi yazınız:");
        char harf=scan.next().charAt(0);

        switch (harf){

            case 'I':
            case 'i':
                System.out.println("I: International");
                break;
            case 'S':
            case 's':
                System.out.println("S: Software");
                break;
            case 'T':
            case 't':
                System.out.println("T: Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Q: Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("B: Board");
                break;
            default:
                System.out.println("Girdiğiniz harf ISTQB ismi içinde yer almamaktadır.");

        }
    }
}
