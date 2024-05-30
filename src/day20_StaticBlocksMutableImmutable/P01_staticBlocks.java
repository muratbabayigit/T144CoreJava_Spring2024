package day20_StaticBlocksMutableImmutable;

public class P01_staticBlocks {

    /*
    Static bloklar class çalışmaya başladığında
    tüm kodlar çalışmadan önce çalışan yapılardır
    HATTA main method çalışmadan önce çalışır

    Eeğr class çalışmaya başladığında bazı ayarların yapılması
    bazı variable'lar değer atanması gerekiyorsa gibi durumlarda kullanılır

     */


    P01_staticBlocks(){
        System.out.println("Parametresiz constructor çalıştı");
    }
    P01_staticBlocks(String isim){
        System.out.println("Parametreli constructor çalıştı");
    }
    static {
        System.out.println("Static2 block çalıştı");
    }


    public static void main(String[] args) {
        System.out.println("Main method çalıştı");
        method1();
        P01_staticBlocks obj1=new P01_staticBlocks();
    }

    public static void method1(){
        System.out.println("Method-1 çalıştı");
    }

    public static void method2(){
        System.out.println("Method-2 çalıştı");
    }

    static {
        System.out.println("Static block çalıştı");
    }

}
