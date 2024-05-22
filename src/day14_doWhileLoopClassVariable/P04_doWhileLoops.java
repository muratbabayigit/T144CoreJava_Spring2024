package day14_doWhileLoopClassVariable;

import java.util.Scanner;

public class P04_doWhileLoops {
    //Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve
    // sifredeki hatalari yazdirin.
    //	Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
    //	gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
    //		- Sifre kucuk harf icermelidir
    //		- Sifre buyuk harf icermelidir
    //		- Sifre ozel karakter icermelidir
    //		- Sifre en az 8 karakter olmalidir.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        int flag = 0;

        do {
            System.out.print("Lütfen Bir Şifre Giriniz: ");
            sifre = scan.nextLine();


            for (int i = 0; i < sifre.length(); i++) {
                if ((sifre.charAt(i) >= 32 && sifre.charAt(i) <= 64)) {

                    System.out.println("Şifrenizde özel karakter olmalıdır.");
                    flag++;
                    break;
                }
                if (!(sifre.charAt(i) >= 65 && sifre.charAt(i) <= 90)) { //ASCII tabosunda 65 büyük A'dır('a'+32='A')

                    System.out.println("Şifrenizde büyük harf olmalıdır.");
                    flag++;
                    break;
                }
                if (!(sifre.charAt(i) >= 97 && sifre.charAt(i) <= 122)) { //'a' yerine 97 yazılabilir. Bu onun ASCII tablosundaki karşılığıdır
                    System.out.println("Şifrenizde küçük harf olmalıdır.");
                    flag++;

                    break;

                } if (sifre.length() < 8) {

                    System.out.println("Şfreniz 8 karakterden az olamaz!");
                    flag++;
                }

            }


            if (flag == 0) {
                System.out.println("Şifreniz başarıyla kaydedildi!");
            }

        } while (flag != 0);

    }

}
