package day03_scannerClassWidening;

public class P06_dataCasting {
    public static void main(String[] args) {


        // Küçük data türündeki dataları büyük data türüne atamak istersek
        // java bu genişletme işlemini  otomatik olarak yapar. Buna auto widening denir

       // b y t e  <   s h o r t   <    i n t   <   l o n g   <   f l o a t   <   d o u b l e

        byte a=15;
        short b=a;

        int c=a;
        double d=a;

        //Büyük data türündeki degeri, küçük data tründeki variable'a atamak istersek
        // java bunu otomatik olarak yapmaz. veri kaybu olabilceği için sorumluluk almamızı ister
        // Dönüşüm sorunlu olmayacaksa biz sorumluluğu almak için
        // büyük data türünün önüne değiştirmek istediğimiz türü parantez içinde yazarız
        // Bu olaya explicit narrowing

        double sayi1=256.8;

        int sayi2=(int)sayi1;

        short sayi3=(short)sayi1; //paratez içindeki türe dönüşmesine izin verdiğimi belirtiyorum

        byte sayi4=(byte)sayi1;


        System.out.println("sayi1 = " + sayi1); // 234.8
        System.out.println("sayi2 = " + sayi2); // 234   yuvarlama yapmadan sadece noktadan öncesini alır
        System.out.println("sayi3 = " + sayi3); // 234
        System.out.println("sayi4 = " + sayi4); // -22  ?





    }
}
