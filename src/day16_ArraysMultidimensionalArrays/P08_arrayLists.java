package day16_ArraysMultidimensionalArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class P08_arrayLists {
    public static void main(String[] args) {


    // Arrayler yeni eleman eklemeye izin vermemesi nedeniyle esnek çalışmayı kısıtlar
    // Bu nedenle array ile liste hazırlamak zordur.
    // Bu durumda arraylerin alt yaıpısını kullanana List'ler tercih edilir
    // List'ler elemen eklemeye ve boyut değiştirmeye izin verirler


    List<Integer> sayilar=new ArrayList<>();//List bir interface'dir ve interface'lerden obje oluşturulamaz
        System.out.println(sayilar); //[]

        sayilar.add(128);
        sayilar.add(886);
        sayilar.add(712);

        System.out.println(sayilar); // [128,886,712]

        sayilar.add(1,9716);

        System.out.println(sayilar);// [128,9716,886,712]


        ArrayList<Integer> liste2=new ArrayList<Integer>();

        liste2.add(9901);
        liste2.add(9902);
        liste2.add(9903);
        liste2.add(9904);
        liste2.add(9905);
        liste2.add(9905);

        System.out.println(liste2);

        liste2.add(0,9900);
        System.out.println(liste2);

        sayilar.addAll(liste2);// [128, 9716, 886, 712, 9900, 9901, 9902, 9903, 9904, 9905, 9905]
        sayilar.addAll(2,liste2);
        System.out.println(sayilar);



    }
}
