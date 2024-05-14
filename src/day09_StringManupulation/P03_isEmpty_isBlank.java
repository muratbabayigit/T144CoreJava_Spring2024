package day09_StringManupulation;

public class P03_isEmpty_isBlank {
    public static void main(String[] args) {

        String str1="";
        String str2=" ";
        String str3="         ";
        String str4="    .     ";

        System.out.println(str1.length()); // 0
        System.out.println(str2.length()); // 1
        System.out.println(str3.length()); // 9
        System.out.println(str4.length()); // 10


        //isEmpty() methodu string ifadenin içinde herhangi bir şey var mı oyok mu onabakar.
        // Eğer hiçbir şey yoksa(lenght==0) ise true verir.
        // boşluk dahil herhangi bri karaketer varsa false verir

        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty()); //false
        System.out.println(str3.isEmpty()); //false
        System.out.println(str4.isEmpty()); //false

        // isBlank() methodu içindeki boşluk karakteri hariç bir şey var mı diye bakar

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); // true
        System.out.println(str4.isBlank()); // false



    }


}
