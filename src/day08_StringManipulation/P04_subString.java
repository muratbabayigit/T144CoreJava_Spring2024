package day08_StringManipulation;

public class P04_subString {
    public static void main(String[] args) {

        String str="Java Güzeldir.";

        System.out.println(str.substring(3)); //a Güzeldir.


        //Son harfi subsring ile bulmak
        System.out.println(str.substring(str.length()-1)); //.

        System.out.println(str.length()); //14

        System.out.println(str.substring(28)); //CTE (Compile Time Error) vermez

        // Java değerden kaynaklanan hataları compile ederken görmez
        // Run edince 20.index'e ulaşmaya çalışır bulamayınca Run Time Error (RTE)
        // IndexOutofBoundsExcepiton hatası verir
    }
}
