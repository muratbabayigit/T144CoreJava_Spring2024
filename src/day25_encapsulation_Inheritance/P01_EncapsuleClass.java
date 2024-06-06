package day25_encapsulation_Inheritance;

public class P01_EncapsuleClass {
    /*
    Access Modifier
        private -----> sadece kendi class'ından ulaşılabilir
        default -----> bulunduğu package içindeki tüm class'lardan
        protected ---> bulunduğu package içindeki tüm class'lardan ve child class'lardan
        public ------> her yerden
        ulaşılabilir
    */
    private String isim="Mest Hastanesi";
    private String basHekim="Dr.Levent Seflek";
    private String adres;
    private String telefon;
    public String hastaAd;
    private int hastaNo=101;

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getIsim() {
        return isim;
    }

    public int getHastaNo() {
        hastaNo++;
        return hastaNo;
    }

    public String getBasHekim() {
        return basHekim;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefon() {
        return telefon;
    }


}
