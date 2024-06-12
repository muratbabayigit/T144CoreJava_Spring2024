package day28_PolymorphismAbstractionInterface;

public abstract class P09_abstractParent extends P06_AbstractClassGP {
    // Abstract class'larıb abstract child class'ları
    // abstract methodları override etmeke ZORUNDA DEĞİLDİR
    // Eğer kod yazan isterse override edebilir

    public  abstract  void  method1();

    public void method2() {
        System.out.println("abstract parent method 2");

    }

    public abstract void method3();

    public abstract void method6();






    public void method7(){
        System.out.println("abstract parent method 7");
    };


}
