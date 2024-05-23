package day16_ArraysMultidimensionalArrays;

import java.util.Arrays;

public class P03_StringSiplitMethodu {
    public static void main(String[] args) {
        String str="Ey edip adanada pide ye, ye Edip ye";

       // str.split(",");
       // işlem ile , baz alınarak str bölünür ve her bir elemanı array'in elemanı olan bir array oluşturur
       System.out.println(Arrays.toString(str.split(",")));
       System.out.println(Arrays.toString(str.split(" ")));

       //str=str.replace(" ","");
       str=str.replaceAll(" ","");
       str=str.replace(",","");
       System.out.println(Arrays.toString(str.split("")));




    }
}
