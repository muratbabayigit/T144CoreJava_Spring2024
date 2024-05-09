package day07_NestedIfElseTernary;

import java.util.Scanner;

public class P01_NestedIfElse {
    /*
    Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
    kullaniciya musteri karti olup olmadigini sorun.
    Musteri karti varsa
    10 urunden fazla alirsa %20,
    az alirsa %15 indirim yapin,
    Musteri karti yoksa
    10 urunden fazla alirsa %15,
    az alirsa %10 indirim yapin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen aldığınız ürün adedini giriniz: ");
        int adet=scan.nextInt();
        System.out.print("Ürünün Liste fiyatını giriniz: ");
        double fiyat=scan.nextDouble();
        System.out.print("Wise Club kartınız var mı?(E/H): ");
        char kart=scan.next().charAt(0);

        if (kart=='E' || kart=='e'){
            if(adet>10){
                System.out.println("Ödeyeceğiniz  %20 indirili toplam tutar: "+fiyat*adet*0.8);
            }else{
                System.out.println("Ödeyeceğiniz  %15 indirili toplam tutar: "+fiyat*adet*0.85);
            }
        }else if(kart=='H' || kart=='h'){
            if(adet>10){
                System.out.println("Ödeyeceğiniz  %15 indirili toplam tutar: "+fiyat*adet*0.85);
            }else{
                System.out.println("Ödeyeceğiniz  %10 indirili toplam tutar: "+fiyat*adet*0.90);
            }
        }else{
            System.out.println("Yanlış Değer Girildi");
        }
    }
}
