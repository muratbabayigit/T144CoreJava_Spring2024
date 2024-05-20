package day13_MethodOverloadingWhiledoWhileLoop;

public class P02_WhileLoop {
    public static void main(String[] args) {
        //Başlangıç ve bitiş değerleri belli olan ve artış miktarı sabit olan dönülerde
        //forLoop kullanlır

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println("----- Aynı işlemi While Loop ile Yapalım -------");
        int i=1;

        while (i<=10){
            System.out.print(i+" ");
            i++;

        }
    }
}
