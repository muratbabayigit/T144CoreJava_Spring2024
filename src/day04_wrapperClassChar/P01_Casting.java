package day04_wrapperClassChar;

import java.util.Scanner;

public class P01_Casting {
    public static void main(String[] args) {



        int sayi1=26;
        int sayi2=4;


        System.out.println(sayi1/sayi2); //
        //matematiksel işlemlerde her iki değer de int ise sonuç int olur
        //sonuç double bile olsa noktadan sonrasını silip int olarak döner
        double sayi3=30;

        System.out.println(sayi3/sayi2); //7.5
        //değerlerden bir tanesi bile double ise sonuc double olarak doner

        //Soru: Int olarak kullanıcıdan 3 sayı alarak bunların sonucunu double olarak yazdırın
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 3 sayı giriniz:");
        System.out.print("1.Sayı: ");
        int sayi4=scan.nextInt();  //15
        System.out.print("2.Sayı: ");
        int sayi5= scan.nextInt();//20
        System.out.print("3.Sayı: ");
        int sayi6= scan.nextInt();//30

        System.out.println("Girilen Sayıların Ortalaması: "+(sayi6+sayi5+sayi4)/3); //21
        //eger bolunen ve bolen int ise sonuc int doner

        System.out.println("Girilen Sayıların Ortalaması: "+((double)(sayi6+sayi5+sayi4)/3)); //21.666

        System.out.println("Girilen Sayıların Ortalaması: "+(double)(sayi6+sayi5+sayi4)/3); //21.666
        System.out.println("Girilen Sayıların Ortalaması: "+(double)((sayi6+sayi5+sayi4)/3)); //21.0
        //Son satırda önce işlemi yaptı yani ortalamayı int olarak buldu. Sonucu double olarak yazdı


        System.out.println("Girilen Sayıların Ortalaması: "+((sayi6+(double)sayi5+sayi4)/3)); //





    }
}
