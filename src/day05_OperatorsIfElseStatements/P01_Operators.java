package day05_OperatorsIfElseStatements;

public class P01_Operators {
    public static void main(String[] args) {
        /*
         java'da bir çok operator vardır. Bu operatörler
            - Atama Operatörü =
            - Kaşılaştırma Operatörleri
            - Mantıksal Operatörler
            - Matematiksel operatörler

         */

        //Atama Operatörü
        // herhangi bir variable'a değer verdiğimizde ona karşılık gelen değeri yazarız

        int a = 125;


        //Karşılaştırm Operatörleri

        // Eşitlik Operatörü (==)
        // java = ile eşitlik kontrolü yapmaz atama işlemi yapar
        // iki değerin eşit olup olmadığını kontrol etmek için == operatörü kullanılır
        // bu operatör bize boolean sonuç döndürür true/false

        int sayi1=10;
        int sayi2=20;

        System.out.println(sayi1 == sayi2);

        // != operator sağ tarfının sol tarafına eşit olmadığını ifade eder
        // java da herhangi bir mantıksal degerin onüne ! işareti konulursa o değil anlamı oluşturur
        // !true --- > false
        // !false ---> true
        System.out.println(sayi1 != sayi2);

        /*
            > : büyüktür
            < : küçüktür
            >= : büyük eşittir
            <= küçük eşittir
         */


        // Mantıksal Operatorler

        // AND Operatörü  &&: iki koşulun ya da iki mantıksal değerin birlikte doğru olmasını ister

        int c=12;
        int b=20;
        int d=8;
        System.out.println(b>c && c>d); //&& ifadesi hem ilk hem ikinci karşılaştırmayı doğru ise true verir
        //1 tanesi yanlışsa false verir
        System.out.println(b>c && d>c); // false
        System.out.println(b<c && d>c); //false  && olduğu için ilk false'da kararı açıkladı. gerisine bakmadı
        System.out.println(b<c & d>c);  //false  & olduğu için hepsine bakıp karar açıkladı

        /*
        OR Operatörü: ||
        bu operatörün sağındaki ya da solundaki ifadelerden
        sadece birinin doğru olması yeterlidir.
        sadece bir tanesi bile doğru ise true verir
        ikisi de yabnlış ise false verir
         */

        System.out.println(b>c || d>c);  // true
        System.out.println(b<c || d<c);  // true
        System.out.println(b<c || d>c); // false


        // Matematiksel Operatörler

        /*
        + toplama: sağındaki sayı ile solundaki sayıyı toplar
        - çıkarma: sağındaki sayıdan ile solundaki sayıyı çıkarır
        * çarpma: sağındaki sayı ile solundaki sayıyı çarpar
        / bölme: sağındaki sayıyı ile solundaki sayıya böler
        % Modulus: sağındaki sayının solundaki sayıya bölünmesi ile kalan sayıyı verir
         */

        int toplam=a+b;
        System.out.println("toplam = " + toplam);

        int fark=a-c;
        System.out.println("fark = " + fark);

        int carpim=c*d;
        System.out.println("carpim = " + carpim);

        double oran=a/b;
        System.out.println("oran = " + oran);

        int kalan=a%d;
        System.out.println("kalan = " + kalan);





    }
}
