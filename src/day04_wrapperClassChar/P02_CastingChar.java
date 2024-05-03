package day04_wrapperClassChar;

import java.util.Scanner;

public class P02_CastingChar {

    //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir harf giriniz: ");
        char girilenHarf=scan.next().charAt(0); //k

        System.out.println("girilenHarf = " + girilenHarf);//k
        System.out.println("girilenHarf = " + (char)girilenHarf);//k

        System.out.println(girilenHarf+1); //108

        System.out.println("Girilen harften sonraki 3 harf:");
        System.out.println((char)(girilenHarf+1)); //l
        System.out.println((char)(girilenHarf+2)); //m
        System.out.println((char)(girilenHarf+3)); //n

        System.out.println("Girilen harften sonraki 3 harf: "+((char)(girilenHarf+1))+","
                                                             +((char)(girilenHarf+2))+","
                                                             +((char)(girilenHarf+3)));







    }
}
