package day18_Constructor;

public class P02_CarRunner {
    public static void main(String[] args) {

        P01_Car car1=new P01_Car();
        System.out.println(car1.marka);
        System.out.println(car1.model);
        System.out.println(car1.yil);
        System.out.println(car1.fiyat);

        car1.marka="Renault";
        car1.model="Megane 4";
        car1.yil=2017;
        car1.fiyat=30000;

        System.out.println(car1.marka);
        System.out.println(car1.model);
        System.out.println(car1.yil);
        System.out.println(car1.fiyat);
        System.out.println("--------------------------");

        System.out.println(car1);
        System.out.println("--------------------------");
        //P01_Car{marka='Renault', model='Megane 4', yil=2017, fiyat=30000}

        P01_Car car2=new P01_Car();
       // System.out.println(car2);
        car2.marka="Pegout";
        car2.model="408";
        car2.yil=2022;
        car2.fiyat=40000;
        System.out.println(car2);

        System.out.println("--------------------------");

        P01_Car car3=new P01_Car("Nissan","Micra");


        P01_Car car4=new P01_Car("Opel","Corsa",2018);
        System.out.println(car3);
        System.out.println("--------------------------");
        System.out.println(car4);

        System.out.println("--------------------------");
        P01_Car car5=new P01_Car("Mazda2");
        System.out.println(car5);


    }
}
