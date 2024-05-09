package day06_IfStatementIfElseStatements;

import java.util.Scanner;

public class P03_IfElseStatements {

    /*
    Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
    ucgen eskenar ise “Eskenar ucgen” yazdirin.
    Değilse "eşkenar üçgen değil" yazdırın
   */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz:");
        System.out.print("İlk Kenar: ");
        int kenar1 = scan.nextInt();
        System.out.print("İkinci kenar:");
        int kenar2 = scan.nextInt();
        System.out.print("Üçüncü Kenar:");
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3) {

            System.out.println("Kenar ölçülerini giridiğiniz üçgen bir Eşkenar Üçgendir");
        } else {
            System.out.println("Kenar Ölçülerini girdiğiniz üçgen Eşkenar Üçgen Değildir");
        }
    }

}
