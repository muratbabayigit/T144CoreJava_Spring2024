package day13_MethodOverloadingWhiledoWhileLoop;

import java.util.Scanner;

public class P03_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse toplami yazdirin.
         */
        Scanner scan=new Scanner(System.in);

        int toplam=0;

        while(toplam<500){  //parantez içindeki koşul doğru olduğu müddetçe döngü çalışır
            System.out.println("Toplamları bulunacak sayıları sırasıyla girip enter tuşuna basınız :");
            int sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Toplam: "+toplam);
    }
}
