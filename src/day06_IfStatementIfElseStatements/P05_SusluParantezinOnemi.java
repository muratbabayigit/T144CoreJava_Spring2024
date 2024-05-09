package day06_IfStatementIfElseStatements;

public class P05_SusluParantezinOnemi {
    public static void main(String[] args) {


        /*
        if () {

            İf Body

              }
        Eğer {} kullanmazsak ja ilk ;'e kadar olan kısmı if body olarak alır

         */

        int sayi=44;

        // sayı çift ise ayrı Sayı 2 ile bölünür ve çift sayı yazdırsın
        // sayı tek ise ayrı Sayı 2 ile bölünmez ve tek sayı yazdırsın


        if(sayi%2!=0)
            System.out.println("Çift Sayı"); //İf body'si tek satır olur
            System.out.println("Sayı 2 ile bölünür");

        //else
        System.out.println("Tek Sayı");
        System.out.println("Sayı 2 ile bölünmez");

    }
}
