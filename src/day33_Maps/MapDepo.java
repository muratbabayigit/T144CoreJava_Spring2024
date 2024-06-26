package day33_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {
    public static void main(String[] args) {

    }
    public static Map<Integer, String> mapOlustur() {
    Map<Integer, String> ogrenciMap =new HashMap<>();
        ogrenciMap.put(101,"Mustafa-İsmail-11-A-SAY");
        ogrenciMap.put(102,"Murat-Yiğit-11-K-EA");
        ogrenciMap.put(103,"Serpil-Cem-11-A-SÖZ");
        ogrenciMap.put(104,"Neslihan-Koç-11-A-SAY");
        ogrenciMap.put(105,"Levent-Seflek-11-K-EA");
        ogrenciMap.put(106,"Can-Yılmaz-11-A-SAY");
        ogrenciMap.put(107,"Berk-Yiğit-10-C-SÖZ");
        ogrenciMap.put(108,"Rana-Ülker-12-A-EA");
        ogrenciMap.put(109,"İsmail-Kaya-Mezun-B-EA");

        return ogrenciMap;
}
    public static String numaraylaBilgiGetirme(Map<Integer, String> ogrenciMap,int ogrNo ){
        String ogrValue=ogrenciMap.get(ogrNo); // Rana-Ülker-12-A-EA
        String [] ogrValueArr=ogrValue.split("-"); // [Rana,Ülker,12,A,EA]

        String isim=ogrValueArr[0];
        String soyisim=ogrValueArr[1];
        String istenenformat=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
                +" "+soyisim.toUpperCase();

        return istenenformat;
    }


    public static void sinifListesiYazdir(Map<Integer, String> ogrenciMap, int sinif) {
        //istenen sınıf türüne ait bilgileri yazdırabilmek için önce
        // tüm bilgileri bir collection içine kaydedelim
        Collection <String> values=ogrenciMap.values();
        int siraNo=1;

        for (String eachValues : values) {
            //Rana-Ülker-12-A-EA

            // her bir döngüde gelen değeri split edelim

            String [] eachvaluesArr=eachValues.split("-");

            // Bu aşamadan sonra oluşan arr içindeki sınıf değeri
            // istenen sınıf degerine eşitse yazdırırız
            // değilse bir sonraki döngüye giderz

            if(eachvaluesArr[2].equals(sinif+"")){
                System.out.println(siraNo+"- "+eachvaluesArr[0]+" "+eachvaluesArr[1]+" "+eachvaluesArr[2]+" "+eachvaluesArr[3]);
                siraNo++;
            }



        }



    }

    public static void numaraylaBilgiUpdate(Map<Integer, String> ogrenciMap, int ogrNo, String yeniSoyad) {
        String values=ogrenciMap.get(ogrNo); // Berk-Yiğit-10-C-SÖZ
        String [] valuesArr=values.split("-");// [Berk,Yiğit,10,C,SÖZ]
        valuesArr[1]=yeniSoyad;// [Berk,Babayiğit,10,C,SÖZ]

        //Değişiklik yapıldıktan sonra bu değişiklik ile oluşan verileri yendien map'e uyacak eşkilde birleştirelim
        values=valuesArr[0]+"-"+valuesArr[1]+"-"+valuesArr[2]+"-"+valuesArr[3]+"-"+valuesArr[4];
        ogrenciMap.put(ogrNo,values);



    }

    public static void tumBilgilerleOgrListesiYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer, String>> ogrEntrySeti=ogrenciMap.entrySet();
        //girilen tüm bilgileri bir set içerisine kaydettim

        System.out.println("No     İsim     Soyisim      Sınıfı      Alanı");
        System.out.println("-------------------------------------------------");

        for (Map.Entry<Integer, String> eachEntry : ogrEntrySeti) {
            String eachValue=eachEntry.getValue();
            String [] eachValueArr=eachValue.split("-");

            System.out.println(eachEntry.getKey()+" "+eachValueArr[0]
                                                     +" "+eachValueArr[1]+" "+eachValueArr[2]
                                                     +eachValueArr[3]+" "+eachValueArr[4]);

        }


    }

    public static Map<Integer, String> yilSonuSinifArttir(Map<Integer, String> ogrenciMap) {

        //Girilen k-v olmak üzere tüm bilgileri bir entry set içine kaydedelim
        Set<Map.Entry<Integer, String>> ogrEntrySeti=ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : ogrEntrySeti) {
            String ogrValue=eachEntry.getValue(); // Berk-Yiğit-10-C-SÖZ
            String [] ogrValueArr=ogrValue.split("-"); // [Berk,Yiğit,10,C,SÖZ]

            //2.indexteki sinif bilgisi değerini 1 arttıracağız
            // 9 ---> 10 ---> 11 ---> 12 ---> Mezun


            if (!ogrValueArr[2].equalsIgnoreCase("Mezun")){
                int sinif=Integer.parseInt(ogrValueArr[2]);

                if (sinif<12){
                    sinif++;
                    ogrValueArr[2]=""+sinif;
                }else{
                    ogrValueArr[2]="Mezun";
                }


            }
            eachEntry.setValue(ogrValueArr[0]+"-"+ogrValueArr[1]+
                    "-"+ogrValueArr[2]+"-"+ogrValueArr[3]+"-"+ogrValueArr[4]);

        }
        return ogrenciMap;
    }
}
