package day28_PolymorphismAbstractionInterface;

import java.util.ArrayList;
import java.util.List;

public class P05_childOfAbstractClass extends P04_AbsctractClass {

    @Override
    protected void method1() {
        System.out.println("Merhaba");
    }

    P04_AbsctractClass obj = new P05_childOfAbstractClass() { };

    List<Integer> sayilar=new ArrayList<>();
}
