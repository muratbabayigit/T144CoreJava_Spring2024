package day27_InheritanceOverriding;

public class P11_Child extends P10_Parent{

   /* Biz aynı class'ta aynı signature'a sahip
    method oluşturulamaz

    bir methodun override edilebilmeis için methodun
    child class'ta oluşututlması gerekir
    aynı zamanda parent class'taki signature
     ile aynı olması gerekir
      */

    public void method1(int a){
        //method isminin aynı olması override için yeterli değildir
        //signature'ların da birebir aynı olması gerekir

    }

    @Override
    public void method1() {

      // Override işlemi olabilmesi için
        //Access modifier,return Type da aynı olmalıdır
    }
}
