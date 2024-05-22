package day15_scopeArrays;

public class P08_ElemanSayisiniBulma {
    public static void main(String[] args) {
        //  Verilen bir array’de
        //  istenen bir elemanin var olup olmadigini
        //  ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,4,5,1,2,4,6,7,4,3,2,5,6,7,8,1,2,3,4,5};

        elemanSayisiniYazdir(arr,3);
        elemanSayisiniYazdir(arr,8);
        elemanSayisiniYazdir(arr,2);


    }

    public static void elemanSayisiniYazdir(int[] arr, int arananEleman) {

        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananEleman){
                flag++;
            }
        }
        if (flag==0){
            System.out.println("Aranan Eleman veilen array^de bulunmamaktadır.");
        }else{
            System.out.println("Aradığınız eleman olan "+arananEleman+ ", verilen array'de "+flag+" adet vardır");
        }
    }
}
