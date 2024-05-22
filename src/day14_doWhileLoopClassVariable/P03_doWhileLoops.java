package day14_doWhileLoopClassVariable;

import java.util.Scanner;

public class P03_doWhileLoops {
        // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        // ve bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        // bu negatif sayiyi sayi adedine ve toplama eklemeyin
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int sayi=0;
            int toplam=0;
            String karakter="";
            int flag=0;
            do{
                System.out.print("Toplanmak üzere pozitif tam sayı giriniz: ");
                sayi= scan.nextInt();

                if(sayi>0){
                    toplam+=sayi;
                    flag++;
                }else if(sayi<0){
                    System.out.println("Negatif sayı kullanamazsınız");
                }
            } while(sayi!=0);


            System.out.println("Girdiğiniz "+flag +" adet pozitif tamsayının toplamı :"+toplam);


        }
}
