package day14_doWhileLoopClassVariable;

public class P06_LocalVariable {
    /*
    Local variable'lar method veya kod bloğu içinde oluşturulurlar
    Sadece oluşturuldukları kod bloğu içinde kullanılabilirler
    kod bloğu dışında kullanılamazlar
    Bir method içinde oluturulmuşsa
    sadece o method içinde kullanılır dışında kullanılmazlar

    Local variable'lar değer atamadan oluşturulabilir
    ANCAK değer atamdan kullanılamazlar

     */

    public static void main(String[] args) {
        String  str="Süslü paranteze dikkat"; //Local variable
        System.out.println(str);
       // System.out.println(bl);



        for (int i = 0; i < 10; i++) {
            boolean bl=true;//Local variable
            System.out.println(bl);
            System.out.println(i);
            System.out.println(str);
            str="Merhaba";

        }
        System.out.println(str);
        String s;//Local variable
        int a;//Local variable
        char k;//Local variable
        //System.out.println(s); //Variable 's' might not have been initialized
        //a++; //Variable 'a' might not have been initialized
    }

    public void method1(){
        //System.out.println(str);
        int sayi=30;//Local variable
        System.out.println("sayi = " + sayi);
        //str="hava";
    }

    public static void method2(){
        //str="Hava";
        char ch='a';//Local variable

    }
    }


