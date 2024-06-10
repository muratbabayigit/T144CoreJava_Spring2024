package day27_InheritanceOverriding;

public class P01_GrandParentClass {
    P01_GrandParentClass(){
        System.out.println("GP Parametresiz Constructor Çalıştı");

    }

    P01_GrandParentClass(String s){
        this(12);
        System.out.println("GP String parametreli constructor çalıştı");

    }

    P01_GrandParentClass(int i){
        System.out.println("GP integer parametreli constructor çalıştı");

    }
}
