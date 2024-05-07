package day05_OperatorsIfElseStatements;

import java.util.Scanner;

public class P04_ifStatements {

    public static void main(String[] args) {

        int a=19;
        int b=13;


        if (a>b){
            System.out.println("a b'den büyük");
        }

        boolean sonuc=a<b;
        if (sonuc){
            System.out.println();
        }

        // bağımsız if ile koşul sorguladığımızda sadece true durumlar için bir işlem atanır
        // bağımsız if surumlarında koşuş false ise hiçbir işlem yapmaz.
        // false durularda if kullanılmaz

        //Kullnıcıdan notunu isteyin 50 ve üzeri ise Tebrikler Dersi Geçtiniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        double not=scan.nextDouble();


        //ilk if sorgumuz
        if(not>=50){
            System.out.println("Tebrikler Dersi Geçtiniz");
        }

        //ikinci if sorgumuz
        if (not<50){
            System.out.println("Maalesef Ders Tekrarı");
        }

        // ilk ve ikinci if sorguları tamamen birbirinden bağımsızdır.
        // Birbirlerinin sorularından etkilenmezler
    }
}
