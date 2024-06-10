package day27_InheritanceOverriding;

public class P09_AvciKuslar extends P08_Kuslar {
    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";


    public static void main(String[] args) {


        P09_AvciKuslar kartal1=new P09_AvciKuslar();

        System.out.println(kartal1.beslenme); //Av et yerler
        System.out.println(kartal1.hareket); // Av ucarlar
        System.out.println(kartal1.gaga);//Av sivri gagalı
        System.out.println(kartal1.pence); //Av pencelidir
        System.out.println(kartal1.solunum); // Ku  akcigerle nefes alirlar
        System.out.println(kartal1.omur); // Ha yaşarlar ve ölürler


        P08_Kuslar kartal2=new P09_AvciKuslar();
        System.out.println(kartal2.beslenme); //Ha beslenirler
        System.out.println(kartal2.gaga); //Ku gagaları vardır
        System.out.println(kartal2.hareket); //Ha hareket ederler
        System.out.println(kartal2.kanat); //Ku kanatlıdır
        System.out.println(kartal2.omur); //Ha yaşarlar ve ölürler

        P08_Kuslar kartal3=new P08_Kuslar();
        System.out.println(kartal3.gaga);//Ku gagaları vardır
        System.out.println(kartal3.kanat);//Ku kanatlidirlar
        System.out.println(kartal3.cogalma); //Ku yumurtayla cogalirlar
        // kartal3.pence() obje parenta gider chalid'a gitmez
        System.out.println(kartal3.beslenme);//Ha beslenirler
        System.out.println(kartal3.omur);// Ha yaşarlar ve olurler

       //  P08_Kuslar kartal5=new P07_Hayvanlar(); //parent'ta bulunan constructor child class'ı data türü yaparak obje oluşturamaz

        P07_Hayvanlar kartal4=new P09_AvciKuslar();
        System.out.println(kartal4.solunum);//Ha nefes alirlar


    }

}
