package day20_StaticBlocksMutableImmutable;

public class P03_passByValue {
    //verilen bir sayının karesini alıp
    // sayıyı biz döndüren bir method yazınız



    public static void main(String[] args) {
        int sayi=10;
        System.out.println(karesiniAl(sayi));   //  100

        System.out.println("Method call sonrası sayını değeri: "+sayi); // 10

        //eğer methodda yapılan değişimin kalıcı olması istenirse
        // atama yapılabilir

        sayi=karesiniAl(sayi);

        System.out.println("Atama yapıldıktan sonra sayının değeri: "+sayi); // 100

        System.out.println(karesiniAl(sayi)); // 10000

    }

    private static int karesiniAl(int sayi) {

        sayi=sayi*sayi;

        return sayi;
    }
}
