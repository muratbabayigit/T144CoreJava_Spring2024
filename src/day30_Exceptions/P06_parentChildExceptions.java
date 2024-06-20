package day30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P06_parentChildExceptions {
    public static void main(String[] args) throws FileNotFoundException,IOException {
          // FileNotFoundException kısmının gri olmasının sebebi
         // bu hatayı getiren class'ın IOException'ın child'ı olmasıdır
        // parent dah kapsamlı olduğu için FileNotFoundException 'ı da kapsar yeniden yazmaya gerek yok

        FileInputStream dosyaYolu=new FileInputStream("src/day30_Exceptions/deneme2.txt");


        int k=0;
        while((k= dosyaYolu.read() ) != (-1)) { // dosyayi okuyup, bize getirme
            // Unhandled exception: java.io.IOException
            System.out.print((char) k);
        }
    }
}
