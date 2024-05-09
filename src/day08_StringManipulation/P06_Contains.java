package day08_StringManipulation;

public class P06_Contains {
    public static void main(String[] args) {

        String str="Java çok güzelmiş";

        // contains () methodu birbaşka stringin varlığına bakar
        // varsa true yoksa false dondurur

        System.out.println(str.contains("ava")); //true
        System.out.println(str.contains("A")); //false
        System.out.println(str.contains("a")); //true

        //contains methodu case sensitive dir


        System.out.println(str.contains("Java çok güzelmiş")); //true

        System.out.println(str.contains(""));//true


        System.out.println(str.toUpperCase().contains("A")); //true

        //System.out.println(str.contains('a'));
        //contains() methodu char var mı diye kontrol etmez







    }
}
