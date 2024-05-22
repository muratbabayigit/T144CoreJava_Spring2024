package day14_doWhileLoopClassVariable;

public class P07_ClassVariables {
    /*
    Class variable'lar adından anlaşılacağı üzere class scope içinde
    ama tüm diğer kod bloklarının dışında oluştururlur

    Class levelda oluşturulan variable'lar en üstte oluşturulmak zorunda değildir
    Fakat genl kabul ve görünülürlük açısından üstte tanımlanaması uygun görülür

    class level'da oluşturuan variable kullanım amacına uygun olacak şekilde
    static keyword ile tanımlanabilirler. Local varaiable'lar static olarak işaretlenemezler
    static olarak işaretlenmeyen variable'lar instance variable denir
    Class variable ister static olarak işaretlensin isterse işaretlenmesin scopları tüm class olur

    class variable'lar ister static olsun ister olmasın değer atamadan deklare edilebilir ve KULLANILABİLİRLER
    Eğer herhangi bir class variable değer atamadan oluşturulursa kullanılacağı zaman
    Java ona default değer atar
    java'nın belirlediği default değerler
        char ==> hiçlik ('')
        sayısal primitive'ler==> 0
        boolean ==>false
        non-primitive'ler ==> null
     */

    String str1="Java"; //instance bir class variable
    static int sayi1=10;
    static char a;
    static int b;
    static double c;
    static String d;
    static boolean e;

    public static void main(String[] args) {
       // static int sayi2=120;
        System.out.println(sayi1); //say1 static olduğu için her yerden direk ulaşabildik
       // System.out.println(str1); //str1 instance olduğu için method seçici olur
                                  // main method static olduğu için kendsinden (static) olmayanı kabul etmez
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }

    public void method1(){
        System.out.println("a = " + a); // abcde static olduğu için her yerden direkt ulaşılır
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println(str1); //instance variable'lar method secicidir method static değilse onun içinde de çalışır
                                  //Class level'de tanımlanan instance variable'lar static olmayan methodlarda kullnaılabilir
    }

    public static void method2(){
        System.out.println("a = " + a); // abcde static olduğu için her yerden direkt ulaşılır
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        //System.out.println(str1);
    }

}
