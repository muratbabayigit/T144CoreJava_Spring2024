package day08_StringManipulation;

import org.w3c.dom.ls.LSOutput;

public class P02_Equals {
    public static void main(String[] args) {

        String s1="Ali";
        String s2="ali";
        String s3="ALI";
        String s4="ALi";
        String s5="Ali ";
        String s6="Ali";
        String s7="aLi";

        //equals methodu ile iki string değer karşılaştırılırken case sensitive olarak bakılır
        //Metinlerin aynı olup olmadığınıa bakar


        System.out.println(s1.equals(s2)); //Ali ---> ali ====>false
        System.out.println(s3.equals(s2)); //ALI ---> ali ====>false
        System.out.println(s3.equals(s4)); //ALI ---> Ali ====>false
        System.out.println(s1.equals(s5)); //Ali ---> Ali  ====>false
        System.out.println(s1.equals(s6)); //Ali ---> Ali ====>true

        System.out.println("===================================");

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s1.equalsIgnoreCase(s5)); //boşluk nedeniyle false verir
        System.out.println(s1.equalsIgnoreCase(s6));





    }
}
