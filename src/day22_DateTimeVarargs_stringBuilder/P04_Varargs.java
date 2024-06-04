package day22_DateTimeVarargs_stringBuilder;

public class P04_Varargs {
    // varargs:variety of arguments demek
    /*
        yeni bri method oluştururkengondereceğimiz argument sayısı değişken ise
        farklı methodlar oluşturmak yerine
        parametreye varargs ataması yapılır

        varargs array alt yapısını kullanır
        yani girilen tüm argumentleri bir array içine koyar

     */

    public static void main(String[] args) {
       toplama(3,2); //5
       toplama(3,2,6); // 11
       toplama(3,2,6,9,5); //25
       toplama(12,25,36,32,5,0,1,2,5,9,36,78,159); //400

       carpma(12,5,36);//2160
    }

    public static void carpma(int ... yeniSayilar) {
        int carpim=1;
        for (int each:yeniSayilar
             ) {
            carpim*=each;
        }
        System.out.println("carpim: "+ carpim);
    }

    public static void toplama(int ... sayilar) {
        //sayilar bir array ve içinde parametre olarak girilen argumentler var
        // array'in tüm elemanlarını toplamak istersek
        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each;
            
        }
        System.out.println(toplam);
    }

    // public static void toplama(int a, int b) {
  //     System.out.println("Toplam: "+(a+b));
  // }
  // public static void toplama(int a, int b, int c) {
  //     System.out.println("Toplam: "+(a+b+c));
  // }
  // public static void toplama(int a, int b,int c,int d,int e) {
  //     System.out.println("Toplam: "+(a+b+c+d+e));
  // }




}
