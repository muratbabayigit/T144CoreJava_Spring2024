package day26_Inheritance;

public class P06_ChildClass extends P05_ParentClass{
    P06_ChildClass(){
        System.out.println("C Parametresiz Constructor Çalıştı");

    }

    P06_ChildClass(String s){
        System.out.println("C String parametreli constructor çalıştı");

    }

    P06_ChildClass(int i){
        System.out.println("C integer parametreli constructor çalıştı");

    }

    public static void main(String[] args) {


        P06_ChildClass obj=new P06_ChildClass(5);
    }
}

//extends keyword varsa her sconstructor'ın
//ilk satırında mutlaka bir constructor olmalıdır
//görünür bir constructor yoksa Java
// deafault olarak parametresiz bir super() constructor koyar
