package day10_StringManipulationForLoop;

public class P01_Replace {
    public static void main(String[] args) {
        String str="Java Candır, Gerisi Heyecandır";

        System.out.println(str.replace("a","A")); //JAvA CAndır, Gerisi HeyecAndır
        // CharSequence: charların bir araya gelmesi ile oluşan değerdir. Charlar birleşirse String olur

        System.out.println(str.replace('a','A')); //JAvA CAndır, Gerisi HeyecAndır

        System.out.println(str.replace("Gerisi","Selenium")); // Java Candır, Selenium Heyecandır

        System.out.println(str);

        str="%,& Ahmet git 3 ekmek al!";  //str için yeni bri atama yaptık

        System.out.println(str); //str'ın yeni halini yazdıralım

        System.out.println(str.replaceFirst("\\w","Me")); //%,& Mehmet git 3 ekmek al!

        System.out.println(str.replaceFirst("\\d","15")); //%,& Ahmet git 15 ekmek al!




    }
}
