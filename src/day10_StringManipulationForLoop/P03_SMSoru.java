package day10_StringManipulationForLoop;

public class P03_SMSoru {
    public static void main(String[] args) {

        /*
        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
		input1 : “15.30 €” , input2 : “11.40 €”
		output : 26.70 €
         */

        String input1="15.30 €";
        String input2="11.40 €";

        double deger1=Double.parseDouble(input1.replace("€",""));
        double deger2=Double.parseDouble(input2.replace("€",""));

        System.out.println(deger1);

        double toplam=deger1+deger2;

        System.out.println("Toplam: "+toplam+" €");
        System.out.println("Toplam: "+Double.toString(toplam)+" €");
    }
}
