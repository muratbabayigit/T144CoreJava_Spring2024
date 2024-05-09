package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P08_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 adet vize 1 adet final notu alınsın
        Vize ortalamasının %40'ı Final Notunun %60'ını alarak
        Bir yıl sonu notu oluştursun
        Yıl Sonu notu:  90-100 arası ise AA
                        85-90 arası ise BA
                        80-85 arası ise BB
                        75-80 arası ise CB
                        65-75 arası ise CC
                        60-65 arası ise DC
                        50-60 arası ise DD
                        50 altı ise FF yazdırsın

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Vize Notlarınızı Sırasıyla giriniz");
        System.out.print("1.Vize: ");
        double vize1=scan.nextDouble();
        System.out.print("2.vize: ");
        double vize2= scan.nextDouble();
        System.out.print("Final Notunuzu giriniz: ");
        double finalNotu=scan.nextDouble();

        double vizeOrt=(vize1+vize2)/2;
        double yilSonuNotu=(vizeOrt*0.40+finalNotu*0.60);
        if (yilSonuNotu>=100){
        System.out.println("Yil Sonu Notu: "+100);
        } else if (yilSonuNotu<=0) {
            System.out.println("Yil Sonu Notu: "+0);
        }else {
            System.out.println("Yil Sonu Notu: "+yilSonuNotu);
        }

        if (yilSonuNotu>100 || yilSonuNotu<0){
            if (yilSonuNotu>100){
            System.out.println("hacı sen naaptın. 100'den büyük ortalama mı olur");}
            if (yilSonuNotu<0){
                System.out.println("hacı sen naaptın. Eksi ortalama mı olur");
            }
        }else if (yilSonuNotu>=90 ){
            System.out.println("AA");
        } else if (yilSonuNotu>=85 ) {
            System.out.println("BA");
        } else if (yilSonuNotu>=80 ) {
            System.out.println("BB");
        } else if (yilSonuNotu>=75 ) {
            System.out.println("CB");
        } else if (yilSonuNotu>=65 ) {
            System.out.println("CC");
        } else if (yilSonuNotu>=60 ) {
            System.out.println("DC");
        }else if(yilSonuNotu>=50) {
            System.out.println("DD");
        }else{ //bir ihtimaller ziniciri kontrol edilirken tm ihtimaller bitince sadece else
            System.out.println("FF");
        }


    }
}
