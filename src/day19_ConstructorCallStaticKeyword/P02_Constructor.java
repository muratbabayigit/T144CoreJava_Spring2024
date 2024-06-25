package day19_ConstructorCallStaticKeyword;

public class P02_Constructor {
    String isim="Ahmet";

    public static void main(String[] args) {
            P02_Constructor obj1=new P02_Constructor();

        System.out.println((obj1.isim)); //Ahmet
        obj1.isim="Hamza";
        System.out.println((obj1.isim)); //Hamza

        obj1.method2(); // Static olmayan method çalıştı
        obj1.method1(); // Static method çalıştı
                        //Static member '' accessed via instance reference
        method1(); // Static method çalıştı

        System.out.println( "========= Eşitliğin sağ tarafını alarak kullanalım ==========");

        System.out.println(new P02_Constructor().isim); // Ahmet
        new P02_Constructor().method2(); // Static olmayan method çalıştı
        /*
            eğer sadece new Construcor_name(); şeklinde bir kullanımda
            sadece o satır için bir obje oluşur ve işini yapar.
            o satırdan alt satıra geçince obje yok olur
         */

        System.out.println( "========= Eşitliğin sol tarafını alarak kullanaral null değer atayalım ==========");

        P02_Constructor obj2=null;

        // System.out.println(obj2.isim); //NullPointerException
        // obj2.method2(); //NullPointerException

        obj2.method1();  // Static method çalıştı
        /*
        Constructor kullanmaz ve obj null olarak işaretlenirse
        normal bir objenin yaptıkalrını yapamaz
        nullpointerexception verir

       static olmayan methodlarda çağrılamaz
       fatak static methodlar bu null değer atanan obje ile çağrılabilir ve sorunsuz çalışır




         */






    }

    public static void method1(){
        System.out.println("Static method çalıştı");
    }

    public void method2(){
        System.out.println("Static olmayan method çalıştı");
    }
}
