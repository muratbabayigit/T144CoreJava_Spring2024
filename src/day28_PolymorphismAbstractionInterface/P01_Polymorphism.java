package day28_PolymorphismAbstractionInterface;

import day27_InheritanceOverriding.P07_Hayvanlar;
import day27_InheritanceOverriding.P08_Kuslar;
import day27_InheritanceOverriding.P09_AvciKuslar;

public class P01_Polymorphism {
    public static void main(String[] args) {


        String str="Java Candır";

        System.out.println(str.substring(3));//a Candır
        System.out.println(str.substring(3, 6)); //a C

        P09_AvciKuslar kartal1=new P09_AvciKuslar();
        System.out.println(kartal1.gaga);
        System.out.println(kartal1.pence);

        P08_Kuslar kartal2=new P09_AvciKuslar();
        System.out.println(kartal2.hareket);//çok iyi harket ederler
    }
}
