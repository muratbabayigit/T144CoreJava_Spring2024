package day09_StringManupulation;

public class P01_IndexOfLastIndexOf {
    public static void main(String[] args) {

        String str="Ali topu at, at ali at";

        System.out.println(str.contains("Ali"));
        System.out.println(str.startsWith("Ali"));
        System.out.println(str.endsWith("at"));
        System.out.println("------------------------------------");
        System.out.println("13.harf:"+str.charAt(13));

        //indexOf() metodu herhangi bri ifade içinde geçen bir harf, yada harflerin
        // veyahut da bir kelimenin ilk index'ini verir

        System.out.println(str.length()); // 22
        System.out.println(str.indexOf("Ali")); // 0
        System.out.println(str.indexOf("ali"));  // 16
        System.out.println(str.indexOf("a")); // 9
        System.out.println(str.indexOf("top")); // 4
        System.out.println(str.indexOf("levent")); // -1
        System.out.println(str.indexOf('i')); // 2
        System.out.println(str.indexOf(105)); // 2  105 ascci tablosunda i'ye karşılık gelir dolayısyla i arar
        System.out.println(str.indexOf(97)); // 9   97 ascci tablosunda a'ya karşılık gelir dolayısyla a arar
        System.out.println(str.indexOf("at")); // 9
        System.out.println(str.indexOf("at",14)); // 20


      //lastIndexOf() methodu aranan harf,karakter veya kelimeyi son indexten başlangıca doğru bakar
      // fakat bulunca baştan index sayar


       str="Ali topu at, at ali at";

       // 0-A  1-l 2-i 3- 4-t 5-o 6-p 7-u 8- 9-a 10-t 11-, 12- 13-a 14-t 15-
        // 16-a 17-l 18-i 19- 20-a 21-t

        System.out.println(str.indexOf("at")); // 9
        System.out.println(str.lastIndexOf("at")); // 20
        System.out.println(str.lastIndexOf("at",14)); //14.indexten geriye doğru bak
        System.out.println(str.lastIndexOf("ali",10)); //10.indexten geriye doğru bak

    }
}
