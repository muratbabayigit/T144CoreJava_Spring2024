package day19_ConstructorCallStaticKeyword;

public class P01_ConstructorCall {

    P01_ConstructorCall(){
        // Call to 'this()' must be first statement in constructor body
         this("Levent",40);
        //this("Murat");
        // this(7);
        // Only one explicit constructor call allowed in constructor
        System.out.println("Parametresiz constructor çalıştı");
        // P01_ConstructorCall("Murat"); //Method call expected
        // İsim(parametre) yazimi sadece methodlar için kabul edilir
        // Constructor call için
        //this keywordu yardımıyla call yapılır

    }

    P01_ConstructorCall(String isim){

        System.out.println("İsim parametreli constructor çalıştı");
    }

    P01_ConstructorCall(int sayi){
        System.out.println("Sayı parametreli constructor çalıştı");
    }

    P01_ConstructorCall(String isim, int sayi){
        System.out.println("İsim ve Sayı parametreli constructor çalıştı");
    }


    public static void main(String[] args) {
        System.out.println("Main Method çalıştı");
        method1();

        P01_ConstructorCall obj=new P01_ConstructorCall();

    }

    public static void method1(){
        method2();
        System.out.println("Method 1 Çalıştı");
    }

    public static void method2(){
        System.out.println("Method 2 Çalıştı");
    }
}
