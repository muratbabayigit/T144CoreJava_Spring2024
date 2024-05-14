package day09_StringManupulation;

public class P04_Nullpointer {
    public static void main(String[] args) {


        //non-primitive data türelerini atama yamadan oluşturabiliriz
        //fakat kullanırken bize değer atanmamış olabilir uyarısı verir
        //atama yapmadan kulanamayız.


        String metin;

        // System.out.println(metin); Variable metin might not have been initalized


        String metin2="";

        System.out.println(metin2);
        //"" dahi olsa atansa hata vermeden çalışır
        // hangi variable'da değer atanmştır desem bana metin2 için atandı der

        String metin3=null;  //null keyword

        //içi boş olan bir string oluşturdum.
        System.out.println(metin3);

        // metin2 ile metin3 arasındaki fark nedir?
        // Java metin2 'ye değer atandığı ama metin3'e değer atanmadığını anlar


        System.out.println(metin2.length()); //0
        //System.out.println(metin3.length()); //NullPointerException

        System.out.println(metin2.isEmpty());
        System.out.println(metin2.isBlank());

      //  System.out.println(metin3.isEmpty());  //NullPointerException
     //   System.out.println(metin3.isBlank()); //NullPointerException


    }
}
