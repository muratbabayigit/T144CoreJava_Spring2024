package day10_StringManipulationForLoop;

public class P05_forLoop {
    public static void main(String[] args) {
        //1'den başlayıp 10'a kadar olan(10dahil) sayıları tek tek yazdırsın

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i >-10 ; i--) {
            System.out.print("("+i+")"+" ");

        }
        System.out.println();
        //2 basamaklı çift sayıları yazdırın

        for (int i = 10; i <100 ; i+=2) {
            System.out.print(i+" ");

        }
        System.out.println();

        //soru: 100-500 arası sayılardan 17'ye böülnenleri yazdırın

        for (int i = 100; i <500 ; i++) {
            if(i%17==0){
                System.out.print(i+" ");
            }
        }



    }
}
