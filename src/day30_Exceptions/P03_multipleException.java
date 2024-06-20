package day30_Exceptions;

import java.util.Scanner;

public class P03_multipleException {


    public static void main(String[] args) {
        String str="Java Candır";
        String [] harfler={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s"};


        /*
        Kullanıcıdan bir sayı alıp, bu sayıyı index olarak kaydedip
        str ve array'deki o indexte yer alan elemanı yazdırın

        input:3  output: a,d
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Aradığınız index numarasını giriniz: ");
        int indexNo=scan.nextInt();

        //Eğer olası hata durumları birbirleriyle ilinitili değilse(parent-child)
        // 3 farklı yöntemle sorun aşılabilir

    /*
        System.out.print(str.charAt(indexNo));//StringIndexOutOfBoundsException
        System.out.print(harfler[indexNo]);//ArrayIndexOutOfBoundsException

     */




        // 1- her bir hata blogu icin ayrı bir try-Catch oluşturmak

        /*
        try {
            System.out.print(str.charAt(indexNo));//StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girilen değer String için aralık dışındadır!");
        }
        System.out.print(" - ");
        try {
             System.out.print(harfler[indexNo]);//ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girilen değer Array için aralık dışındadır!");
        }

         */

        //2- Bir adet try ile birden fazla catch bağlamak

        /*
        try {
            System.out.print(str.charAt(indexNo));//StringIndexOutOfBoundsException
            System.out.print(harfler[indexNo]);//ArrayIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girilen değer String için aralık dışındadır!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen değer Array için aralık dışındadır!");
        }
         */

        //3- bir adet try ile geniş kapsamlı bir catch kullanrak işlem yapılabilir

        try {
            System.out.print(str.charAt(indexNo));//StringIndexOutOfBoundsException
            System.out.print(harfler[indexNo]);//ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
            System.out.println("Girilen değer index sınırları dışında");
        }
    }
}
