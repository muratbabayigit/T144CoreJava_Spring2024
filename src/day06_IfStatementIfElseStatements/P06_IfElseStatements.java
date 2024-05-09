package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P06_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        */

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen Cinsiyetinizi giriniz(E/K) : ");
        char cinsiyet=scan.nextLine().toUpperCase().charAt(0);
        System.out.print("Lütfen Yaşınızı giriniz: ");
        int yas= scan.nextInt();

       if ((cinsiyet=='K') && yas>=60) {
           System.out.println("Emekli Olabilirsiniz!");
       }

       if(cinsiyet=='K' && yas<60){
           System.out.println("Emekli olabilmek için "+(60-yas)+" kadar çalışmanız gerekmektedir");
       }

        if ((cinsiyet=='E') && yas>=65) {
            System.out.println("Emekli Olabilirsiniz!");
        }

        if(cinsiyet=='E' && yas<65){
            System.out.println("Emekli olabilmek için "+(65-yas)+" yıl kadar daha çalışmanız gerekmektedir");
        }


    }
}
