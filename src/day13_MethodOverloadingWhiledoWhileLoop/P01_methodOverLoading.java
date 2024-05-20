package day13_MethodOverloadingWhiledoWhileLoop;

public class P01_methodOverLoading {
    public static void main(String[] args) {
        topla(); //parametresiz method
        topla(8); //parametreli method
        topla(3,5);
        topla(2.3,3.1);
        topla(2.5f,3.7f);
        topla(2.3,5,3.7f);
    }
    public static void topla(){
        int a=5;
        int b=7;
        System.out.println("Toplam: "+(a+b));
    }
    private static void topla(int sayi) {
        System.out.println("Toplam: "+(sayi+sayi)); //int
    }
    private static void topla(int a,int b) {
        System.out.println("Toplam: "+(a+b)); //int

    }
    private static void topla(double a,double b) { //double
        System.out.println("Toplam: "+(a+b));
    }
    private static void topla(double a,int b,float c) { //double
        System.out.println("Toplam: "+(a+b+c));
    }
}
