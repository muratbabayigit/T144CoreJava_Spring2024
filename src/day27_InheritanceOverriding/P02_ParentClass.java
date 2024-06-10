package day27_InheritanceOverriding;

public class P02_ParentClass extends P01_GrandParentClass {
    P02_ParentClass(){
        System.out.println("P Parametresiz Constructor Çalıştı");

    }

    P02_ParentClass(String s){
        this();
        System.out.println("P String parametreli constructor çalıştı");

    }

    P02_ParentClass(int i){
        super("Esma");
        System.out.println("P integer parametreli constructor çalıştı");

    }
}
