package day30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P07_parentChildExceptionTryCatch {
    public static void main(String[] args) {

        String dosyaYolu="src/day30_Exceptions/deneme2.txt";

        FileInputStream fileInputStream;

        {
            try {
                fileInputStream = new FileInputStream(dosyaYolu);
                int k=0;
                while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme

                    System.out.print((char) k);
                }
            }catch (FileNotFoundException e) {
                System.out.println("Dosya belirtilen konumda bulunamadı. \nDosya yolunu kontrol ediniz");
            }catch (IOException e){
                System.out.println("Input-Output ile ilgili bir sorun algılandı. Kontrol ediniz");
            }
        }
    }


}
