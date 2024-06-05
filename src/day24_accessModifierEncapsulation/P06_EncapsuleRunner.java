package day24_accessModifierEncapsulation;

public class P06_EncapsuleRunner {
    public static void main(String[] args) {
        P05_encapsuleClass obj=new P05_encapsuleClass();

        //hicbir getter ya da setter işlemi yapmadan
        //sadece adres degerine ulaşabilir ve değiştirebilirim

        obj.schAdress="Üsküdar";
        System.out.println(obj.schAdress); //Üsküdar


        // Write and read yetkisini sınırlamak için
        // access modifier ile private variabe oluştururlur
        // Daha sınra vermek istediğimiz yetki için
        // getter setter metodlarından faydalınılır


        obj.setStuName("Murat");
        System.out.println(obj.getStuName());



        obj.setPhoneNumber("2589632147");

        System.out.println(obj.getPhoneNumber());
    }
}
