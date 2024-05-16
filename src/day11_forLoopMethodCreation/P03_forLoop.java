package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P03_forLoop {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin
        //  ve String'in Palindrome olup olmadigini yazdirin
        //  palindrome : tersden yazilisi ayni olan, or : madam
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Palindrome olup olmadığını kontrol edeceğiniz metni yazınız: ");
        String metin= scan.nextLine();
        String tersMetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {
                tersMetin+=metin.charAt(i);
        }

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girdiğiniz metin bir polindrome'dur");
        }else{
            System.out.println("Giridğiniz metin palindrome değildir.");
        }
    }
}
