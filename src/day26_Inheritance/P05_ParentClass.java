package day26_Inheritance;

public class P05_ParentClass extends P04_GrandParentClass{
    P05_ParentClass(){
        System.out.println("P Parametresiz Constructor Çalıştı");

    }

    P05_ParentClass(String s){
        System.out.println("P String parametreli constructor çalıştı");

    }

    P05_ParentClass(int i){
        System.out.println("P integer parametreli constructor çalıştı");

    }
}
