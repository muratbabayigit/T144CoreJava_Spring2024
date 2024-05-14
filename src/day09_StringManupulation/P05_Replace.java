package day09_StringManupulation;

public class P05_Replace {

    public static void main(String[] args) {
        String str="Java Candır. Selenium Heyecandır";
        System.out.println(str);
        str=str.replace('a','A');
        System.out.println(str);

        str=str.replace("CAndır.","Kolaydır.");
        System.out.println(str);

        str="Java Candır. Selenium Heyecandır";
        //sadece ilk a harfini A yapsın

        System.out.println(str.replaceFirst("a","A"));
        System.out.println(str);







    }

}
