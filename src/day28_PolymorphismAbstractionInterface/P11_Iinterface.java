package day28_PolymorphismAbstractionInterface;

public interface P11_Iinterface {

    // full abstraction sağlmak amacıyla kullanılır
    // bu nedenle tüm methodlar public ve abstracttır
    // Interface içinde
    // tüm variable'lar final,static ve public
    // Tüm methodlar ise public ve abstract'tır.



    public abstract void method1();//Modifier 'abstract' is redundant for interface methods

    public void method2();
    abstract void method3();

    void method4();
    public static final int SAYI=20;
   // int yas; Interface içinde tüm variable'lar final olduğu için atama yapmadan oluşturulamaz
    int method5();
}
