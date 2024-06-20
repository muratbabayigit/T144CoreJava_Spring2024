package day30_Exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class P01_exception {
    public static void main(String[] args) {
        /*
        Kullanicdan  iki adet tam sayi alip bu tamsayılarin
        bolumnun sonucunu yazdirin
         */
        int sayi1=0;
        int sayi2=0;
        boolean problemVarmi=true;

        while(problemVarmi) { //problemVarmi=true olduğu müddetçe döndür
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Bölme işleminde kullanılacak iki tamsayı giriniz");
                System.out.print("Birinci tamsayı: ");
                sayi1 = scan.nextInt();
                System.out.print("Ikinci tamsayı: ");
                sayi2 = scan.nextInt();
                problemVarmi = false;
            } catch (InputMismatchException e) {
                System.out.println("Hatalı Giriş. Lütfen Tamsayı giriniz!");

            }
        }

        if(sayi2==0){
           System.out.println("İkinci sayı sıfır olamaz");
       }else{
           System.out.println("Birinci sayının ikinci sayıya bölümü: "+ sayi1/sayi2);
       }



    }
}
