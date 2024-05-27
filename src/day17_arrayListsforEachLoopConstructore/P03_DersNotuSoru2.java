package day17_arrayListsforEachLoopConstructore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_DersNotuSoru2 {

    /*
    Kullanicidan istedigi kadar isim alip,
    Q’ya bastiginda girdigi isimleri bize
    liste olarak dondurecek bir method olusturun.
     */



    public static void main(String[] args) {
        System.out.println(isimlistesiOlustur());


    }

    public static List<String> isimlistesiOlustur() {
        Scanner scan=new Scanner(System.in);
        List<String> isimler=new ArrayList<>();
        String girilenIsim="";

        while(!girilenIsim.equalsIgnoreCase("q")){
            System.out.print("Listeye eklenecek ismi giriniz: ");
            girilenIsim= scan.nextLine();

            if(!girilenIsim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsim);
            }
        }
        return isimler;
    }
}
