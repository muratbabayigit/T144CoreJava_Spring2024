package day02_dataTurleriScanner;

public class P03_nonPrimitiveData {

    public static void main(String[] args) {

        // primitive data türleri sadece deger alır
        // NonPrmitive data türü ise degerl alabildiği gibi
        // Methodlar da alabilir.

        int sayi=20;
        System.out.println("sayi = " + sayi); //sayi=20

        String str="Have a nice day";

        System.out.println("str = " + str); //Have a nice day


        System.out.println(str.toUpperCase()); //HAVE A NİCE DAY

        System.out.println(str.toLowerCase()); //have a nice day


        int numara=100, sicil=100, not=100;
        int numara2,not2,sicil2;

        byte num1=127;
        short num2=32767;

        System.out.println("Long Min Değer: "+Long.MIN_VALUE);



    }
}
