package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P04_IfElseStatements {
    public static void main(String[] args) {
         /*
            Kullanicidan bir karakter girmesini isteyin
            girilen karakterin büyük harf olup olmadığını kontrol edin
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz: ");
        char girilenHarf=scan.next().charAt(0);

        System.out.println(girilenHarf);

        if (girilenHarf >= 'A' && girilenHarf<= 'Z'){
            System.out.println("Girilen Harf Büyük Harftir");
        }else{
            System.out.println("Girilen harf küçük harftir");
        }


        //Sornun wrapper class ile çözümü

        if (Character.isUpperCase(girilenHarf)){
            System.out.println("Girilen Harf Büyük Harftir");
        }else{
            System.out.println("Girilen harf küçük harftir");
        }
      }
    }

