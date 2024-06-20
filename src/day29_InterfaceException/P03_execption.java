package day29_InterfaceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P03_execption {

    public static void main(String[] args) {



        int sayi1 = 0;
        int sayi2 = 0;
        boolean problemvarmi=true;

        while (problemvarmi){
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Lutfen iki tamsayi giriniz");
            System.out.print("Birinci tam sayi ");
            sayi1 = scan.nextInt();
            System.out.print("Ikinci tam sayi ");
            sayi2 = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Tam sayi dedik!... Sen ondalikli girdin");


        }


        if (sayi2 == 0) {
            System.out.println("Ikinci sayi 0 olamaz");

        } else {
            System.out.println("Sonuc" + (sayi1 / sayi2));
            System.out.println("Kod hatali ise bu satir calismaz");


        }
        System.out.println("Bu kadar hatali ise bu satir calismaz");
    }
}}