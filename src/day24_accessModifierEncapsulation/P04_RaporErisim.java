package day24_accessModifierEncapsulation;

public class P04_RaporErisim {




    public static void main(String[] args) {
        P03_RaporClass obj=new P03_RaporClass();
        //satisTutatri ve toplamSatisTutari private olduğu için
        // normal yollaral bu variable'lara ulaşamayız

       // Burada devreye encapsulation giriyor
       // encapsulation' data hiding 'de denir
        System.out.println(obj.getSatisTutari());

        obj.setSatisTutari(2000);;
        obj.setSatisTutari(250);;
        obj.setSatisTutari(750);;
        obj.setSatisTutari(1250);;
        obj.setSatisTutari(1350);;
        obj.setSatisTutari(1500);;

        System.out.println(obj.getToplamSatisTutari());

    }

}
