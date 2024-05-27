package day17_arrayListsforEachLoopConstructore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02_DersNotuSoru4 {
    /*
     Verilen pozitif bir n tamsayisini alarak,
     bize ilk n tane tane Fibonacci sayisini bir list olarak donduren
     bir method olusturun.
     fibonacci --> 0,1,1,2,3,5,8,13,21,34,55,..
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Hesaplanacak fibonacci dizisi için bir tamsayı giriniz: ");
        int n= scan.nextInt();
        System.out.println(fibonaccihesapla(n));;
    }

    private static List<Integer> fibonaccihesapla(int n) {
        List<Integer> fibonacci=new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        int toplam= fibonacci.get(0)+ fibonacci.get(1);

        for (int i = 0; i < n-2; i++) {
            toplam= fibonacci.get(i)+ fibonacci.get(i+1);
            fibonacci.add(toplam);

        }
        return fibonacci;
    }


}
