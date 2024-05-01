package day03_scannerClassWidening;


import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan uc farkli data turunde deger alip, 
        girilen degerleri aciklamalariyla yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        
        //String
        System.out.print("Lütfen adınızı giriniz: ");
        String name=scan.nextLine();
        System.out.println("İsim = " + name);

        System.out.print("Lütfen Soyadınızı giriniz:");
        String surname= scan.nextLine();
        System.out.println("Soyadı = " + surname);

        System.out.print("Lütfen telefon numaranızı giriniz: ");
        int telNo= scan.nextInt();
        System.out.println("Telefon = " + telNo);

        scan.nextLine(); //scan.nextLine atlama problemini yok ediyor.

        System.out.print("Lütfen Mail adresinizi giriniz:");
        String email= scan.nextLine();
        System.out.println("Email = " + email);

        System.out.print("Lütfen Ondalıklı bir sayı giriniz: ");
        //char harf=scan.next().charAt(0);
        double sayi= scan.nextDouble();
        System.out.println("sayi = " + sayi);


        
        
    }
}
