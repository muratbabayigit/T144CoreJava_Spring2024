package day03_scannerClassWidening;

import java.util.Scanner;

public class P02_Scanner {
    /*
    Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
		Isminiz : John
		Soyisminiz : Doe
		Yasiniz : 44
		Kaydiniz basariyla tamamlanmistir.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Adınız: ");
        String name= scan.nextLine();

        System.out.print("Soyadınız: ");
        String surname= scan.nextLine();

        System.out.print("Yaşınız: ");
        int age= scan.nextInt();

       // System.out.println("İsminiz : "+name);
       // System.out.println("Soyisminiz : "+surname);
       // System.out.println("Yaşınız : "+age);
       // System.out.println("Kaydiniz basariyla tamamlanmistir.");
        System.out.println(); //Boş bir satır oluşturduk
        System.out.println("İsminiz : "+name+"\nSoyisminiz : "+surname+"\nYaşınız : "+age+"\nKaydiniz basariyla tamamlanmistir.");


    }
}
