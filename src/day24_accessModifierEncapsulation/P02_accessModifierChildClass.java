package day24_accessModifierEncapsulation;

import day23_stringBuuilderAccessModifier.P03_AccessModifier;

public class P02_accessModifierChildClass extends P03_AccessModifier {
    public static void main(String[] args) {
        P02_accessModifierChildClass obj=new P02_accessModifierChildClass();

        System.out.println(obj.ProSayi);
        obj.ProSayi=100;

    }


}
