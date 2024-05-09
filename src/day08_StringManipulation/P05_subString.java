package day08_StringManipulation;

public class P05_subString {
    public static void main(String[] args) {
        //Substring tek parametreli olunca girilen parametreden sona kadar gider
        // Substring çift parametreli ise girilen ilk parametreyi dahil olarak alıp ikinci parametreye kadar gider
        // (3,4) girilirse sadece 3. karakteri alır. 4. karakter alınmaz
        // (3,7) girilirse 3,4,5,6. karakteri alır. 7. karakter alınmaz

       String str="Java Heyecandır.";


       System.out.println(str.substring(5,6)); // H
       //System.out.println(str.charAt(5));

        //ilk üç karakteri yazdır
        System.out.println(str.substring(0,3)); // Jav

        //Son 3 karakteri
        System.out.println(str.substring(str.length()-3));  //Tek Parametreli
        System.out.println(str.substring(str.length()-3,str.length())); //Çift parametreli


        // System.out.println(str.substring(9,4)); RTE:IndexOutOfBoundsException


        //String Birleştirme: Concatenation
        String str1="Java ";
        String str2="Güzeldir";
        int sayi=12;

        System.out.println(str1+str2); //Java Güzeldir
        System.out.println(str1+sayi); // Java 12
        System.out.println(str1.concat(str2)); //Java Güzeldir

       // System.out.println(str1.concat(sayi)); //Java Güzeldir
       // Concatenation methodu sadece string olanları birleştirir.






    }
}
