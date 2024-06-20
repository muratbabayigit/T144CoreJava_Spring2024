package day30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P05_checkedException {
    public static void main(String[] args) throws FileNotFoundException {


       /*
        Bildiğimiz bazı exceptionlar

        RUN TIME EXCEPTIONS:

        NullPointerException
        ArrayIndexoutOfBoundsException
        StringIndexoutOfBoundsException
        InputMissMatchException
        ArithmeticException


        COMPILE TIME EXCEPTIONS:

        Kodlarımızı yazdığımızda javanın farkına vardığı exception türleridir

        Bu exception tütürnde de RunTimeException'daki gibi
        try-catch bloklarıyla sorunu çözüp
        kodun çalışmaya devam etmesini sağlayabiliriz

        Eğer kodlarımızın çalışmaya devam etmesini istemiyorsak
        Altı kırmızı çizgi ile çizilen hatayı yok edip
        kodlarımızın çalışmasını sağlamak istiyorsak
        bunu  method sifnature'a throws keyword'ü ekleyerek yapabiliriz

        Ancak bu keywords kullanımı ile sadece bilgilendirme yapar
        bir exception fırlatıp yine kodun çalışmasını durdurur
        Hatayı kontrol altına almaz

        */

        FileInputStream dosyaYolu=new FileInputStream("src/day30_Exceptions/deneme.txt");
    }
}
