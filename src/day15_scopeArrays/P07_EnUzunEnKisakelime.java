package day15_scopeArrays;

public class P07_EnUzunEnKisakelime {
    public static void main(String[] args) {

        //Verilen String bir array’deki en uzun
        // ve en kisa kelimeleri yazdiran bir method olusturun.
        String [] isimler={"Ali","Murat","Ela","Abdurrahman","Sibel","Tarık","Sena"};
        enUzunEnKisaYazdir(isimler);
    }

    public static void enUzunEnKisaYazdir(String[] kelimeler) { //methodun parametresini array olarak belirledik
        String enKisa=kelimeler[0];
        String enUzun=kelimeler[0];
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length() > enUzun.length()) {
                enUzun=kelimeler[i];
            }
            if (kelimeler[i].length()<enKisa.length()){
                enKisa=kelimeler[i];
            }

        }
        System.out.println("enKisa = " + enKisa);
        System.out.println("enUzun = " + enUzun);


    }
}
