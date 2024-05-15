package day10_StringManipulationForLoop;

import java.util.Scanner;

public class P06_forLoop {
    /*
    Kullanicidan pozitif bir tamsayi alin,
    1’den girilen sayiya kadar(girilen sayi dahil)
    7 ila bolunebilen sayilari yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Pozitif bir yamsayı giriniz: ");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
