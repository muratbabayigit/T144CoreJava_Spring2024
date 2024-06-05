package day23_stringBuuilderAccessModifier;

public class P04_AccessModifier {
    public static void main(String[] args) {


        P03_AccessModifier obj=new P03_AccessModifier();

        //System.out.println(obj.privSayi);
        System.out.println(obj.defSayi);  //aynı package içinde olduğumuz için ulaşbildik
        System.out.println(obj.ProSayi);  //aynı package içinde olduğumuz için ulaşbildik


    }
}
