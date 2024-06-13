package day29_InterfaceException;

public class P02_childOfInterfaceIstisna implements P01_InterfaceIstisna{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    /*
        implement ettiğimiz P01_Interface'e sonradna eklediğimiz
        methodlar body'ye sahip olduğu için override etme zorunluluğu yoktur.

        interface içinde body'si olan istisnia methodları oluşturmak için
        static ve deafult keywordleri kullanılır
        o methodlara erişim yöntemindeki farklılıklara göre static ya da default olacağına karar verilir

        static keyword ile oluşturulan istisnai methodlara class ismi ile ulaşılabilir
        default keyword ile oluşturulan istisnai methodlara obje oluşturularak ulaşılabilir

     */

    public static void main(String[] args) {
        P01_InterfaceIstisna.method5();

        P02_childOfInterfaceIstisna obj=new P02_childOfInterfaceIstisna();
        obj.method4();


    }

}
