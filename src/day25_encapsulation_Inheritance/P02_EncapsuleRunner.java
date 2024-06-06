package day25_encapsulation_Inheritance;

public class P02_EncapsuleRunner {



    public static void main(String[] args) {
        P01_EncapsuleClass obj=new P01_EncapsuleClass();
        obj.hastaAd="Murat";
        System.out.println(obj.hastaAd);

        System.out.println(obj.getIsim());
        System.out.println(obj.getBasHekim());
        obj.setAdres("Üsküdar");
        System.out.println(obj.getAdres());
        obj.setTelefon("2164815151");
        System.out.println(obj.getTelefon());
        System.out.println(obj.hastaAd);
        System.out.println(obj.getHastaNo());

        // encapsulation'da get ile başlayan methodlarla getirilen veriler kullanılır ama değer ataması yapılamaz
        // set ile başlayan bmethodlar ise getirilen verilere yeni değer atamak için kullanılır.


    }
}
