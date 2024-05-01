package day02_dataTurleriScanner;




import java.util.Scanner;

public class P05_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan veri(örneğin ismini, yaşını vb) almak için
        //scanner class kullanılır

       // SORU: Kullanıcıdan ismini alıp yazdırın

      //1.Adım Scanner classından obje oluşturulur
        Scanner scan=new Scanner(System.in);


      //2.Adım: Kullanıcıdan isteyeceğimiz veri için bir açılama yazdırıyoruz
        System.out.print("Lütfen Adınızı Giriniz: ");

      //3.Adım: İstediğimiz bilginin data türüne göre scanner objesi üzerinden method kullanalım
        String girilenIsim=scan.nextLine();

      // next(): Girilen string ifadeyi ilk boşluğa kadar alır Rana
      // nextLine(): Girilen ifadenin tamamını alır Rana Nur

        System.out.println(girilenIsim);




    }
}
