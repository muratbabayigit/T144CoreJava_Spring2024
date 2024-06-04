package day22_DateTimeVarargs_stringBuilder;

public class P07_varargsDikkatEdilecekler {
    public static void main(String[] args) {
        /*

        Varargs olayında dikkat edilecek en önemli şey
            - varargs(int ...) parametresi en sonda olmalıdır
            - Buna bağlı olarakda iki veya dahafazla farklı varargs parametre olarak girilemez



         */


        // argument olarak verilen tamsayilardan
        // son sayi haric geriye kalanlari toplayip
        // bulunan toplam degeri ile son sayinin carpimini
        // yazdiran bir method olusturun

        islem(1,3,4,2,6,9,12,56,45);
        islem(1,2,3,4,5,6,10);

    }

    private static void islem(int ... sayilar) {
        //varargs'da son elemanı varargs parametremetresinden sonra giremeyiz
        int toplam=0;
        int lastElement=sayilar[sayilar.length-1];

        for (int i = 0; i <= sayilar.length-2; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("Sonuç:"+(lastElement*toplam));

    }
}
