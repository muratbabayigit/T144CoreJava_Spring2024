package day10_StringManipulationForLoop;

public class P02_replaceAll {
    public static void main(String[] args) {
        String str="J4a5va G3üzel65d25i25896r";

        // str=str.replace("4","");
        //Bu sadece 4'leri değişirir.

        //Tüm rakamları değiştirme(silme) işlemi için replaceAll() metodu kullanılır.

        str=str.replaceAll("\\d","");
        System.out.println(str);

        /*
        \\d: rakamlarla eşleşir(digit)          \\D: Rakam olmayan herşeyle eşleşir
        \\s: space karakterleri ile eşleşir     \\S: Boşluk olmayan herşeyle eşleşir
        \\s+ :yanyana birden fazla boşluk varsa onu ifade eder
        \\w: harf,rakam,_(altçizgi) olan karakterleri ifade eder
        \\W: harf,rakam,_(altçizgi) olmayan karakterleri ifade eder
         */

        str="Java        Öğrenmek çok güzel   ";

        System.out.println(str.replaceAll("\\s",""));//JavaÖğrenmekçokgüzel
        System.out.println(str.replaceAll("\\s+",""));//JavaÖğrenmekçokgüzel
        System.out.println(str.replaceAll("\\s+"," "));//JavaÖğrenmekçokgüzel

        System.out.println();
        System.out.println("----------------------------");
        String str2="Java candır.";
        System.out.println(str2.repeat(5)); //atama yapmadan str2'yi yanyana irilen değer kadar yazdırır
       // str2=str2.repeat(5);  //atama yaparak kalıcı olarak str2'yi değiştirir

        str2="       Java    Candır       ";
        System.out.println(str2.trim()); //Başındaki ve sonuda boşlukları siler



    }
}
