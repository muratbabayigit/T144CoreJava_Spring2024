package day08_StringManipulation;

import java.util.Locale;

public class P01_StringManipulation {
    public static void main(String[] args) {

        String str="Java Candır,Selenium Heyecandır. ae";

        //Verilen str'nin hepsini büyük harf yapın

        str=str.toUpperCase();   // JAVA CANDIR,SELENIUM HEYECANDIR
        System.out.println(str); // JAVA CANDIR,SELENİUM HEYECANDIR


        //verilen st'ın tüm harflaerini lüçük yazdırın
        System.out.println(str.toUpperCase()); //java candir,selenium heyecandir
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));


        //str'in 7. harfini yazdırın

        System.out.println(str.toLowerCase().charAt(6));

        //str içinde kaç karakter vardır
        System.out.println(str.length()); //31

        //son harfi yazdır
       // System.out.println(str.toLowerCase().charAt(31)); // IndexOutOfBoundsException
        // charAt() kullanırken length ya da daha büyük bir değer girilirse hata verir.
        //girilen değer aralık dışında der

        System.out.println(str.toLowerCase().charAt(str.length()-1)); //length: karakter sayısı



        //Sondan 6. harfi yazdıralım
        System.out.println(str.toLowerCase().charAt(str.length()-6));






    }


}
