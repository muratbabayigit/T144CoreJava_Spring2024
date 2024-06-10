package day27_InheritanceOverriding;

public class P03_ChildClass extends P02_ParentClass {
    P03_ChildClass(){
        super("Murat");
        System.out.println("C Parametresiz Constructor Çalıştı");

    }

    P03_ChildClass(String s){
        super(5);

        System.out.println("C String parametreli constructor çalıştı");

    }

    P03_ChildClass(int i){
        System.out.println("C integer parametreli constructor çalıştı");

    }

    public static void main(String[] args) {

        P03_ChildClass obj3=new P03_ChildClass("Sena");
      //  GP integer parametreli constructor çalıştı
      //  GP String parametreli constructor çalıştı
      //  P integer parametreli constructor çalıştı
      //  C String parametreli constructor çalıştı


       //P03_ChildClass obj2=new P03_ChildClass();
      // GP Parametresiz Constructor Çalıştı
      // P Parametresiz Constructor Çalıştı
      // P String parametreli constructor çalıştı
      // C Parametresiz Constructor Çalıştı


        // P03_ChildClass obj=new P03_ChildClass(5);
       // GP Parametresiz Constructor Çalıştı
       // P Parametresiz Constructor Çalıştı
       // C integer parametreli constructor çalıştı



    }
}

//extends keyword varsa her constructor'ın
//ilk satırında mutlaka bir constructor olmalıdır
//görünür bir constructor yoksa Java
// deafault olarak parametresiz bir super()
// constructor koyar

// Eğer kodu yazan kişi
// this(parametre) ile super(parametre) constructorlar'ından
// sadece bir  constructor alabilir.
// Çünkü sadece 1 adet constructor call olabilir.
// Java herhangi bir constructor varsa super() koymaz
