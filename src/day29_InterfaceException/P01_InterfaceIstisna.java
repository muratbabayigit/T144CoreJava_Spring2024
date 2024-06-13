package day29_InterfaceException;

public interface P01_InterfaceIstisna {

     /*
     Devam eden praojelerde
     Interface'lere sonradan müdahale etmek gerekirse
     O interface'i kullanan class'larda ciddi problemler oluşabilir

     Java 8 versiyonunda bu konudaki beklentilere istisnai bir çözüm önermiştir

     Sonradan eklenen methodların problem çıkarmaması için
     child class'lara implement ettiğimizde
     interface içindeki istisnai methoların
     body'ye sahip olmasına im kan tanımıştır.
     Bunu static ve default keywordleri ile sağlar
      */
    void method1();
    void method2();
    int method3();

    public default void method4(){
        // Buradaki default access modifier değildir.
        // Access modifier public tir ve ikinci bir access modifier olmaz
        // Buradaki default keyword kullanımı farklı bir durumu ifade eder
        System.out.println("Interface içindeki default keyworde sahip istisnai method");

    }
    public static void method5(){
        // Buradaki default access modifier değildir.
        // Access modifier public tir ve ikinci bir access modifier olmaz
        // Buradaki static keyword kullanımı farklı bir durumu ifade eder
        System.out.println("Interface içindeki static keyworde sahip istisnai method");
    }
}
