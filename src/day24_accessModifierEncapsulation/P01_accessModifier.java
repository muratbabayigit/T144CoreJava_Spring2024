package day24_accessModifierEncapsulation;

import day23_stringBuuilderAccessModifier.P03_AccessModifier;

public class P01_accessModifier {
    public static void main(String[] args) {

        P03_AccessModifier obj=new P03_AccessModifier();

        //System.out.println(obj.privSayi);
        //System.out.println(obj.defSayi);
        //System.out.println(obj.ProSayi);
        obj.publicSayi=30;
        System.out.println(obj.publicSayi);
    }
}
