package day28_PolymorphismAbstractionInterface;

public class P08_ChildOf extends  P07_childOfAbstractClassGP{
    public static void main(String[] args) {

        P08_ChildOf obj=new P08_ChildOf();

        obj.method1(); //Concrete method 1 çalıştı

        obj.method2(); // Concrete method 2 çalıştı

        obj.method3(); // Concrete method 3 çalıştı

        obj.method4(); // abstractGP method 4 çalıştı

        obj.method5(); // Concrete method 5 çalıştı
    }


}
