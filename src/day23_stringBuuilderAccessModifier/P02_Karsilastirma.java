package day23_stringBuuilderAccessModifier;

public class P02_Karsilastirma {

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";
        //İki string builder eşiliğine bakalım
        //
       // sb1==str //Operator '==' cannot be applied to ',tringBuilder', 'String'
        System.out.println(sb1.equals(str)); //Java CTE vermez ama false dödndürür
        //Suspicious call to 'equals()' on 'StringBuilder' object

        System.out.println(sb1.toString().equals(str)); //true

        System.out.println(sb1==sb2); //false
        System.out.println(sb1.equals(sb2)); //false
        System.out.println(sb1.equals(sb1)); // true

        System.out.println(sb1.compareTo(sb2)); //0

        StringBuilder sb3=new StringBuilder("Murat");
        StringBuilder sb4=new StringBuilder("Mustafa");
        StringBuilder sb5=new StringBuilder("Tahsin");
        StringBuilder sb6=new StringBuilder("Can");

        System.out.println(sb3.compareTo(sb4)); //-1
        System.out.println('r'-'s');
        System.out.println(sb3.compareTo(sb5)); //-7
        System.out.println('M'-'T'); //-7
        System.out.println(sb3.compareTo(sb6)); //10      c d e f g h i j k l m



    }

}
