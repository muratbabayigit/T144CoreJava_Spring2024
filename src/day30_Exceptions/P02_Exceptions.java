package day30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P02_Exceptions {
    public static void main(String[] args)  {

        try {
            FileInputStream dosyaYolu=new FileInputStream("src/day30_Exceptions/deneme2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Dosya Okunamadı...");
        }


    }
}
