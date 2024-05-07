package day04_wrapperClassChar;

public class P03_WrapperClass {
    public static void main(String[] args) {

        int sayi1=10;
        //sayi1.

        String str="Java";

        //Java'da non primitive dataların methodları vardır
        System.out.println(str.toLowerCase());

        //primitive dataların hazır methodları olmadığı için
        //ihityaç halinde hazır olan bazı methodları Wrapper Class oluşturmuştur
        //Integer, Double, Byte, Short, Boolean, Long, Float, Character

        Integer sayi2=20;

        String sayi3="25";
        String sayi4="43";

        System.out.println(sayi3+sayi4);//2543

        int sayi5=27;

        int sayi6=Integer.parseInt(sayi4);

        //"show_menu_1" ["show_menu_"+Integer.parseInt(sayi)]
        //show_menu_2 ["show_menu_"+...]
        //show_menu_3
        //show_menu_4

        System.out.println(sayi5+sayi6); //68


        System.out.println(Integer.MAX_VALUE);


        char chr='a';

        System.out.println("chr = " + chr); //a
        System.out.println(Character.toUpperCase(chr)); //A

        System.out.println(Character.isUpperCase(chr)); //false

        //Primitive bir data üzerinde işlem yapmak istediğimizde
        //ihtiyacımız olan methodlara biz Wrapper Class'lar yardımıyla ulaşırız.









    }
}
