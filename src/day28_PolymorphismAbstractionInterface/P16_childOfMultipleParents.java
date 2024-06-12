package day28_PolymorphismAbstractionInterface;

public class P16_childOfMultipleParents
        extends P13_Parent
        implements P14_InterfaceParent, P15_InterfaceParent2 {
    @Override
    public void method2() {
        //InterfaceParent mutlaka method2() olmalı
        //InterfaceParent2 mutlaka method2() olmalı


    }

    @Override
    public void method3() {

    }
}
