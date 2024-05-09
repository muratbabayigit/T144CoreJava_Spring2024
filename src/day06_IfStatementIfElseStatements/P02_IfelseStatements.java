package day06_IfStatementIfElseStatements;


import java.util.Scanner;

public class P02_IfelseStatements {
    public static void main(String[] args) {
        //Girilen Sayı çift ise "Çift Sayı" değil se "Tek Sayı" yazdırsın

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayı giriniz: ");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Çift Sayı");
        } else {
            System.out.println("Tek Sayı");
        }

    }
}
