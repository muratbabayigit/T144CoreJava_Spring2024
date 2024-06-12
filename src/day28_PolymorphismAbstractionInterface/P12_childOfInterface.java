package day28_PolymorphismAbstractionInterface;

public class P12_childOfInterface implements P11_Iinterface {
    @Override
    public void method1() { }

    @Override
    public void method2() { }

    @Override
    public void method3() {}

    @Override
    public void method4() {}

    @Override
    public int method5() {return 0;}

    public static void main(String[] args) {
        System.out.println(SAYI);
       // sayi=15;

        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Short.MIN_VALUE); //-32768
    }
}
