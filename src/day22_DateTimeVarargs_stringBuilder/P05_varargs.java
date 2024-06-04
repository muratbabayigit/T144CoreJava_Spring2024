package day22_DateTimeVarargs_stringBuilder;

public class P05_varargs {
    public static void main(String[] args) {
        // verilen sayıların içerisindeki tek sayıların toplamını veren bir method yazınız
        tekSayilariTopla(12, 25, 24, 38, 46, 19, 108, 23, 34, 128, 101, 103, 1507);
    }

    // int [] sayilar
    public static void tekSayilariTopla(int... sayilar) {
        int toplam = 0;
        for (int m : sayilar
        ) {
            if (!(m % 2 == 0)) {
                toplam += m;
            }
        }
        System.out.println("Tek Sayıların Toplamı: " + toplam);
    }


}