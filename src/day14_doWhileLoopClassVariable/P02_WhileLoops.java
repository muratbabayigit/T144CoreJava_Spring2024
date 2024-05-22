package day14_doWhileLoopClassVariable;

import java.util.Scanner;

public class P02_WhileLoops {
    /*
    Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
    Kullaniciya bitirmek istediginde Q'a basmasini soyleyin
    Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
    ve bunlarin toplaminin kac oldugunu yazdirin
    Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
    bu negatif sayiyi sayi adedine ve toplama eklemeyin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String karakter="";
        int toplam=0;
        int sayi=0;
        int flag=0;//bir işlemin kaç kere gerçekleştiğini saymak için genelde flag kullanılır


        while(!(karakter.equals("Q") || karakter.equals("q"))){
            System.out.print("Toplamak için pozitif bir sayı giriniz\nÇıkış yapmak için Q tuşuna basınız\nSayı: ");

            if(scan.hasNextInt()){  //Kullnıcının int girip girmediğini kontrol ediyor
                sayi=scan.nextInt(); //Her döngüde yeni bir sayı alıyor ve kaydedemiyor.
                if (sayi<0){
                    System.out.println("Negatif sayı kullanamazsınız");
                }else{
                    toplam+=sayi;
                    flag++;

                }
            }else if(scan.hasNextLine()){
                karakter= scan.nextLine();
            }

        }
        System.out.println("Girdiğiniz "+flag+" adet pozitif tamsayının toplamı: "+toplam);


    }
}
