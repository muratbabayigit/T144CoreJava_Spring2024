package day08_StringManipulation;

public class P03_Equals_doubleEqualsSign {
    public static void main(String[] args) {

        String s1="Ali";
        String s2="Ali";
        String s3= new String("Ali");
        String s4= "Al"+"i";
        String s="A";
        String t="li";
        String s5=s+t;

        // equals yerine == operatörü olursa
        // variable'lar karşılaştırılırken hem metne hem referans değerine bakar

        System.out.println(s1==s2); //true
        System.out.println( s1==s3); // false
        System.out.println(s1==s4); //true
        System.out.println(s1==s5); //false
        System.out.println("================");
        //equals() ve equalsIgnoreCase() sadece metne bakar

        System.out.println(s1.equals(s2)); //true
        System.out.println( s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //true
        System.out.println(s1.equals(s5)); //tru

        System.out.println("================");
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println( s1.equalsIgnoreCase(s3)); //true
        System.out.println(s1.equalsIgnoreCase(s4)); //true
        System.out.println(s1.equalsIgnoreCase(s5)); //true
    }
}
