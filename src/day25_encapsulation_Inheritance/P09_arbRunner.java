package day25_encapsulation_Inheritance;

public class P09_arbRunner {

    public static void main(String[] args) {
       P08_Icon_1_5DCI icon= new P08_Icon_1_5DCI();


        System.out.println(icon.kasa); // A  Kasa Tipi belirtilmedi

        System.out.println(icon.marka); // R Renault
        System.out.println(icon.model); // M Megane Otomatik
        System.out.println(icon.motor); // I
        System.out.println(icon.yakit); // I
        System.out.println(icon.lastik); // R
        System.out.println(icon.cekis); // R
        System.out.println(icon.sanzuman); // M
        System.out.println(icon.uretimYeri);// M
        System.out.println(icon.guvenlik); // I
        System.out.println(icon.farSensoru); // I
        System.out.println(icon.yagmurSensoru);// I

    }
}
