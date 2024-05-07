package day05_OperatorsIfElseStatements;

public class P03_IncrementsDecrements {
    public static void main(String[] args) {
        /*
        Increment bir sayısal değerin değerini kalıcı olarak ykseltme işlemidir
        Sayıyı başka bir sayı ile çarparak, toplayarak arttırabilir

            - sayının değerini 3 artırma
            - sayının dğerimi 5 katına çıkarma
            - sayının değerini 1 arttırma

         */

        int sayi=12;
        System.out.println("Sayının ilk değeri: "+sayi);

        //sayının değerini 3 arttırma

       // sayi=sayi+3;

       // sayi+=3; // += operatörü solndaki sayının değerini sağındaji sayı kadar arttırır
       // System.out.println("Sayının 3 fazlası: "+sayi);

        sayi*=3; //*= operatörü solndaki sayının değerini sağındaki katına çıkarır
        System.out.println("Sayının 3 Katı: "+sayi);
        
      // sayi*=-1;
      // System.out.println("sayi = " + sayi);
        
      sayi++; //sayının değerini 1 arttırır  
        System.out.println("sayi = " + sayi);
        sayi--; //sayının değerini 1 azaltır
        System.out.println("sayi = " + sayi);


        sayi=sayi-3; //sayının değerini 3 azaltır sonra atama yapar
        System.out.println("sayi = " + sayi);
        sayi-=3; //sayıyı azaltarak atama yapar
        System.out.println("sayi = " + sayi);
        sayi/=3;
        System.out.println("sayi = " + sayi);


        //Post-Increment / Pre-Increment

        int number=15;
        //post Increment
        System.out.println(number++); //  önce 15 yazdırır sonra değerini 16 yapar
        System.out.println(number);   // 16


        //PreIncrement
        System.out.println(++number);  //   önce arttırdı sonra yazdırdı 17
        System.out.println(number);    //17
        

         int number2=18;
         //post Decrement
         System.out.println(number2--); //  önce 18 yazdırır sonra değerini 17 yapar
         System.out.println(number2);   // 17
        //Pre Decrement
         System.out.println(--number2);  //   önce azalttı sonra yazdırdı 16
    }
}
