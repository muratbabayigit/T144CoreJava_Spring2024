package day03_scannerClassWidening;

public class P05_dataCasting {
    public static void main(String[] args) {

        int sayiInt=32;
        short sayiShort=23;
        double sayiDouble=22;
        String str="Java";
        char chr='K';
        boolean bl=true;
        char ch2=32;

         // String a=sayiInt;
        // String b=bl;

       // char c=str;
       // char d=sayiInt; Dikkat değerin 32 olması değil int bir veri olması problem

        double dbl=sayiInt;
        dbl=sayiShort;
        dbl=chr;

        //int in=sayiDouble;

    }
}
