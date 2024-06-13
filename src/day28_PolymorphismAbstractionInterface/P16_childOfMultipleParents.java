package day28_PolymorphismAbstractionInterface;

public class P16_childOfMultipleParents
        extends P13_Parent
        implements P14_InterfaceParent, P15_InterfaceParent2 {

    @Override
    public void method2() {
        System.out.println("Child Class method2");

    }

    @Override
    public int method3() {
        System.out.println("Child Class method3");
        return 71;
    }

    public static void main(String[] args) {
        P16_childOfMultipleParents obj=new P16_childOfMultipleParents();

        obj.method1();//Parent Class method 1
        obj.method2();//Child Class method2
        obj.method3();////Child Class method3

        System.out.println(P14_InterfaceParent.sayi); //20
        System.out.println(P15_InterfaceParent2.sayi); //30

        System.out.println(isim);
        System.out.println(yas);
    }


}
