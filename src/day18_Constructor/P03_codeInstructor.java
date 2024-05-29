package day18_Constructor;

public class P03_codeInstructor {

    String name="Atanmadı";
    String address="Girilmedi";
    int age;

    P03_codeInstructor(){
        age=40;
    }

    P03_codeInstructor(int age){
        age=30;
        address="Üsküdar";
    }

    P03_codeInstructor(String name,String address){
        this.name=name;
        this.address="Beşiktaş";
    }

    public static void main(String[] args) {

        P03_codeInstructor obj3=new P03_codeInstructor("Beytullah","Beykoz");
        System.out.println(obj3.age+","+obj3.name+","+obj3.address);

        //P03_codeInstructor obj2=new P03_codeInstructor(44);
       // System.out.println(obj2.age+","+obj2.name+","+obj2.address);

       // P03_codeInstructor obj1=new P03_codeInstructor();
       // System.out.println(obj1.age+","+obj1.name+","+obj1.address);








    }
}
