package day02_dataTurleriScanner;

public class P02_dataTurleri {

    public static void main(String[] args) {

        byte sayi1=23; // hafızada 8 bit yer kaplar

        short sayi2=23; //hafızada 16 bit yer kaplar

        int sayi3=23; //hafızada 32 bit yer kaplar

        long sayi4=23; //hafızada 64 bit yer kaplar


        char chr=80;  //bu 80'in ascii karşılığını atamış oldum
        char chr1='a';
        char chr2=' '; //space de bir karakterdir, *,&,% gibi
       // char chr3='80';

        String str1="Java candır"; //String data türü sadece metinse ifade içerir
        String telNo="5555555"; // telefon numarası string olarak tanımlanmıştır.
                               // üzerinde değişiklik yapılamaz, sadece değiştirilebilir

        System.out.println("str1"); // str1 yazdırır
        System.out.println(str1); // Java candır yazdırır


        int x=128;
        int y=312;

        //iki sayının toplamını yazduıralım
        System.out.println("Verilen iki sayının Toplamı: "+(x+y));
        
        
        int ogrenciNumara;  // Primitive data türleri deger atamadan oluşturulabilir
                            // ama değer atamadan kullanılamaz
        
        ogrenciNumara=9720016;
        System.out.println("Öğrenci Numarası = " + ogrenciNumara);

        double db1=20.368;
        double db2=6;

        System.out.println(db1/db2); //

        float fl1=20.1f;
        float fl2=5f;

        System.out.println(fl1/fl2);


    }


}
