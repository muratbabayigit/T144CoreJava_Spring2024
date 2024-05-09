package day08_StringManipulation;

public class P07_startsWithendsWith {
    public static void main(String[] args) {

        String str="Java gün geçtikçe güzelleşiyor";

        // Bu cümle ne ile başlıyor J - Jav - Java - Java gün -Hiçlik

        System.out.println(str.startsWith("J")); //true
        System.out.println(str.startsWith("Java")); //true
        System.out.println(str.startsWith("Java ")); //true
        System.out.println(str.startsWith("Java gün ")); //true
        System.out.println(str.startsWith("Java gün geçtikçe güzelleşiyor")); //true
        System.out.println(str.startsWith("")); //true

        System.out.println(str.startsWith("g",5));
        System.out.println(str.startsWith("e",9));

        str="Java gün geçtikçe güzelleşiyor";
        System.out.println(str.endsWith("yor")); //true
        System.out.println(str.endsWith("")); //true
        System.out.println(str.endsWith("Java gün geçtikçe güzelleşiyor")); //true



    }
}
