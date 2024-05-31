package day21_MutableandImmutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_mutableImmutable {

    public static void main(String[] args) {
        String str="Have a nice day";

        System.out.println(str); //Have a nice day

        System.out.println(str.toUpperCase());  //HAVE A NİCE DAY
        System.out.println(str.toLowerCase()); //have a nice day
        System.out.println(str.replace("a", "e")); //nice day
        System.out.println(str.substring(6)); // nice day


        System.out.println(str);// Have a nice day
        System.out.println("--------------------------------------");

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(886,712,499,9720016,300,500,700,1352));

        System.out.println(sayilar); //[886, 712, 499, 9720016, 300, 500, 700, 1352]

        sayilar.remove(2);
        Integer silinecekSayi=9720016;
        sayilar.remove(silinecekSayi);
        sayilar.set(2,6350);
        sayilar.add(5510);



        System.out.println(sayilar);
        System.out.println("--------------------------------------");



    }
}
