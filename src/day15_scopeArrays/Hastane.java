package day15_scopeArrays;

public class Hastane {
    /*
    java'da objlerin ortak olan tüm variable'larıstatik olarak oluşturulur
    sadece bir obje için gerekli olan variable'lar ise instance oluşturulur

    Biz bir obje oluşturduğumuzda Java o obje için tüm instance variable'ların bir kopyasını oluşturur
    oluşturulan objeyle instance variablları ilişkilendiriyor
    obje.InstancevariableIsmi şeklinde oluşan variable'lara ulaşabiliriz
     */
    static String hastaneIsmi="Yıldız Hastanesi";
    static String hastaneAdres="Üsküdar";
    static String hastaneBasHekim="Levent Bey";

    String personelIsmi="İsim atama yapılmadı";
    String personelAdres="Adres atama Yapılmadı";
    int personelAge;
    String personelGorev="Görev ataması yapılmadı";

    public static void main(String[] args) {
        //Bir personel Ekleyelim
       // Hastane personel01=new Hastane();
       // Hastane personel02=new Hastane();
       // Hastane personel03=new Hastane();
       // Hastane personel04=new Hastane();
       // Hastane personel05=new Hastane();


        //Java tüm instance variable'lardan birer kopyayı personel01 için oluşturdu

      //  System.out.println(personel01.personelIsmi);
      //  System.out.println(personel01.personelAdres);
      //  System.out.println(personel01.personelAge);
      //  System.out.println(personel01.personelGorev);

       //personel01.personelIsmi="Fatma Demir";
       //personel01.personelAdres="Ankara";
       //personel01.personelAge=18;
       //personel01.personelGorev="Hemşire";

       //System.out.println("--- Atama Sonrası ---");
       //System.out.println(personel01.personelIsmi);
       //System.out.println(personel01.personelAdres);
       //System.out.println(personel01.personelAge);
       //System.out.println(personel01.personelGorev);

        //Yeni bir personel oluştu
       // personel02.personelIsmi="Rana Ülker";
       // personel02.personelAdres="Istanbul";
       // personel02.personelAge=18;
       // personel02.personelGorev="Hemşire";
//
       // System.out.println(personel02.personelIsmi);




    }



}
