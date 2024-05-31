package day21_MutableandImmutable;

public class P02_StringBuilder {
    public static void main(String[] args) {
        String str2=new String("Murat"); // String str2="Murat";
        System.out.println(str2);
        System.out.println(str2.toUpperCase());
        System.out.println(str2);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        StringBuilder str3=new StringBuilder("babayigit");
        System.out.println(str3);//babayigit
        str3.append("20240531");
        System.out.println(str3);//babayigit20240531
        System.out.println("Yeni Kullanıcı Dosya No: "+str3);
        //Yeni Kullanıcı Dosya No: babayigit20240531
    }
}
