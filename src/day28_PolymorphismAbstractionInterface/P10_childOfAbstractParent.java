package day28_PolymorphismAbstractionInterface;

public class P10_childOfAbstractParent extends P09_abstractParent{

    //Abstract bir silsileden gelen ilk concrete class
    //parent abstract classta' concrete ededilmemiş
    //tüm abstract mehodları override etmek zorunda bırakır

    @Override
    public void method1() {
        System.out.println("concrete child method 1 ");

    }

    @Override
    public void method3() {
        System.out.println("concrete child method 3 ");
    }

    @Override
    public void method6() {
        System.out.println("concrete child method 6 ");
    }

    public static void main(String[] args) {
       P10_childOfAbstractParent obj=new P10_childOfAbstractParent();
       obj.method1();
       obj.method2();
       obj.method4();
       obj.method6();
       obj.method7();
    }
}
