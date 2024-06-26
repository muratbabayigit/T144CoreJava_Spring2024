package day33_Maps;

import java.util.Map;
import java.util.TreeMap;

public class P04_putIfAbsent {
    public static void main(String[] args) {

        /*
        Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.

        Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
        output :a kullanimi : 4 adet (a,4)
                b kullanimi : 2 adet (b,2)
                c kullanimi : 2 adet
                d kullanimi : 1 adet
                k kullanimi : 1 adet
                s kullanimi : 3 adet
                z kullanimi : 1 adet

         */
        String [] harfler={"a","b","s","a","s","c","d","b","c","a","a","s","z","k"};

        Map<String, Integer> harfKullanim=new TreeMap<>();

        for (String each : harfler) {

            if(!harfKullanim.containsKey(each)){
                harfKullanim.put(each,1);
            }else{
                int mevcutSayi=harfKullanim.get(each);
                harfKullanim.put(each,mevcutSayi+1);
            }

        }
        System.out.println(harfKullanim);


        //2.Yöntem
        Map<String, Integer> harfKullanim2=new TreeMap<>();
        for (String each : harfler) {
            if (harfKullanim2.putIfAbsent(each,1) !=null){
                int mevcutSayi=harfKullanim2.get(each);
                harfKullanim2.put(each,mevcutSayi+1);
            }
        }
        System.out.println(harfKullanim2);

    }
}
