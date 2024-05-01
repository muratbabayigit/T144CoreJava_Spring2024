package day02_dataTurleriScanner;

public class P01_variableKullanimi {


    public static void main(String[] args) {


        // bir variable oluştururken önce data türü sonra data ismi ve = ile degeri yazılır
        int sayi = 5;

        // System.out.println("sayi"); //sayi

        //Bir variable değeri yazdırılırken  " " kullnılmaz
        System.out.println(sayi); // 5

        sayi = sayi + 10;

        System.out.println(sayi); // 15

        char chr = '6';
        char chr2 = 65;
        System.out.println(chr); // 6
        System.out.println(chr2); // A - ASCII karakterde 65'in karşılığı

        boolean bl = true;
        System.out.println(bl); //true

        double db = 2.318;
        System.out.println(db); //2.318
        double db2 = 118;
        System.out.println(db2); //118.0

        //Ekran Resmi almak için
        //windows: win+shift+S
        //mac: cmd+shift+4 (tam ekran için 4 yerine 3)

        int sayi2 = 97;
        System.out.println("sayi2=" + sayi2);
    }
}
