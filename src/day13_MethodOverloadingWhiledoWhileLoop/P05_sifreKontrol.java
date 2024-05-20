package day13_MethodOverloadingWhiledoWhileLoop;

import java.util.Scanner;

public class P05_sifreKontrol {
    public static void main(String[] args) {

        //Soru : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglayincaya kadar yeniden sifre isteyin
        //         tum sartlar saglanirsa, "sifre basariyla kaydedildi" yazdirin ve bitirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali

        Scanner scan=new Scanner(System.in);
        String girilenSifre="";
        boolean sifreUygunMu=false;

        while (!sifreUygunMu){ //sifreUygunMu değişkeni true'ya dönene kadar sifre girmesini iste
            System.out.print("Lütfen bir şifre giriniz: ");
            girilenSifre= scan.nextLine();
            sifreUygunMu=sifreKontrol(girilenSifre);
        }
    }

    public static boolean sifreKontrol(String girilenSifre) {
        int hataSayisi=0; //Hata sayisi değişirse hata var demektir. Değişmediyse şifre tüm şartlara uygundur.

        // - ilk harf kucuk harf olmali,
        char ilkKarakter=girilenSifre.charAt(0);
        if (!(ilkKarakter>='a' && ilkKarakter<='z')){
            System.out.println("İlk karakter küçük harf olmalıdır");
            hataSayisi++;
        }
        //  son karakter rakam olmali
        char sonKarakter=girilenSifre.charAt(girilenSifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son Karakter olarak rakam girmelisiniz!");
            hataSayisi++;
        }

        // sifre bosluk icermemeli
        if (girilenSifre.contains(" ")){
            System.out.println("Şifrenizde boşluk olmamalıdır");
            hataSayisi++;
        }

        // uzunlugu en az 10 karakter olmali
        if (girilenSifre.length()<10){
            System.out.println("Şifreniz en az 10 karakter olmalıdır");
            hataSayisi++;
        }
        if(hataSayisi==0){
            System.out.println("Şifreniz başarıyla kaydedildi!");
            return true;
        }else{
            return false;
        }
    }
}
