package day12_Methods;

import java.util.Scanner;

public class P05_ismiIstenenFormattaYazdirma {
    public static void main(String[] args) {

      //Scanner scan=new Scanner(System.in);
      //System.out.println("Adınız :");
      //String isim=scan.nextLine();
      //System.out.println("Soyadınız :");
      //String soyisim=scan.nextLine();
      //System.out.println("Kredi Kartı Numaranız :");
      //String kKno=scan.nextLine();

        duzenleYazdir("Murat","Yakuphanoğullarından","4242154225423542");


    }
        /*
    Kullanıcıdan isim,soyisim,Kredi Kartı numarası alsın
    aşşağıda verilen şekilde yazdıran  bir method oluşturun
    Input: Hamza, Yiğit, 42424242424242424
    Output: H**** Y**** **** **** **** 4242
     */

        public static void duzenleYazdir(String isim, String soyisim, String kKno){

        isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w","*");
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\W","*");//ğüçşöıİĞÜŞÇÖ

        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\W","*");
        /*
            \\w harf,rakam,_ olan her şeyi * yaptı
            [a-zAZığüşçöÖÇŞİÜĞ] regex ayarlayarak içindeki karakterlerin tamamını * yaptı(æ olursa bu çözemez)
            \\W harf,rakam,_ olmayan herşeyi * yaptı (æ olursa bu çözer)
         */

        kKno=kKno.substring(kKno.length()-4);

            System.out.println(isim+" "+soyisim+" "+" **** **** **** "+kKno);


        }


}
