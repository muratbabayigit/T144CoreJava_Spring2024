package day28_PolymorphismAbstractionInterface;

public abstract class P04_AbsctractClass {

    /*
        Java'da normal bir child-parent iliişkisinde genelde söz sahibi child class olur
        Java bu söz sahibi olma durumunu parent class'a vermek için abstract class kullanımını getirmiştir

        Bir class oluşturulduğunda, bu class'ı parent edinmek isteyen
        child class'lar parent tarafından belirlenen bazı methodları override etmek zorundadır.

        Abstract Class'ların kullanımı mecburi değildir
        Eğer obje oluşturmadan child class'lardaki ortak özelliklerini belirleyerek
        kullanmaızı sağlar


        Bir class'ın child class'larının bazı methodları
        override etmeye zorlamak için class'ın abstract edilmesi gerekir


        1- Class signature'da abstrack keyword kullanılmalıdır
        2- Child class'ların bazı methodları override etmek için method singature'a abstract keyword eklenir
        3- abstract methodlar body siz olur

        abstract methodların body'si olmadığından buradan obje oluşturulamaz
        bunun yerine abstract methodlara body kazandıran child class'ların
        constructor'ları kullanılabilir


     */

    // child class'ların override etmesini istediğimiz method'un signature'na abstract keyword ekledik
    protected abstract void method1();

    protected void method2(){ System.out.println("Parent Method 2");}

    protected void method3(){ System.out.println("Parent Method 3");}


}
