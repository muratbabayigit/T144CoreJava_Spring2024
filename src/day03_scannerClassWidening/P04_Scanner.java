package day03_scannerClassWidening;

import java.util.Scanner;

public class P04_Scanner {
    //SORU: (Interview) Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen  A tamsayısını giriniz: ");
        int A=scan.nextInt();

        System.out.print("Lütfen B tamsayısını giriniz: ");
        int B= scan.nextInt();
        System.out.println();
        System.out.println("A="+A); //10
        System.out.println("B="+B); //25
        System.out.println();
        // System.out.println("A="+B);
       // System.out.println("B="+A);
        System.out.println("----------------HOKUS POKUS---------------------");

        //diyelimki A=10 B=25 girilmiş olsun
        // Biz System.out.print(A) deyince 25
        //System.out.print(B) deyince 10 yazdırsın istiyoruz

        int C=0;

        C=A; // C'ye A için girilen değeri atadık
        // A=10 B=25 C=10

        A=B;
        // A=25 B=25 C=10

        B=C;
        // A=25 B=10 C=10

        System.out.println("A="+A); //25
        System.out.println("B="+B); //10






    }
}
