package day30_Exceptions;

public class P08_ExceptionTurleri {
    public static void main(String[] args) {
        /*
        1- NullPointerException
            herhangi bir variable'a değer atanmadan
            kullanılmaya çalışılırsa hata verir
            Eğer Null olarak atama yapılırsa çalışana kadar hata vermez
            ama run edilince değerin bull olduğu ve kullanılamaycağını ifade eder

        2-StringIndexoutOfBoundsException  ve ArrayIndexoutOfBoundsException
            Burada her ikisinde de index değerinden daha fazla bir değer kullanılarak
            işlem yapılmaya çalışılırsa aralık dıiında bir değer girildiğini ifade eder


        3-ArithmeticException
            Matematiksel işlemlerde sonuc vermeyen durumlarda(sayı/0)
            ortaya çıkar

         */

       //4-NumberFormatException
            //String'i Integer'a çevirmek istediğinde
            // Eğer string içinde int olmayan bir değer varsa bu soru ortaya çıkar


            String say1="12a";
            String say2="48";

            System.out.println(say1+say2);

          //  System.out.println(Integer.parseInt(say1)+Integer.parseInt(say2));

        //5- ClassCastException

        Integer sayi=10;

        Object str=sayi; // Objech HAS-A-INTEGER

        String str2= (String) str; //String-IS-A Object

        //6-FileNotFoundException
        //7-IOException
        //8-RunTimeException
        //9-Exception



    }
}
