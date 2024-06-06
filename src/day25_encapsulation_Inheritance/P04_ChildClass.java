package day25_encapsulation_Inheritance;

public class P04_ChildClass extends P03_ParentClass{
    String isim="Child Class";
    String adres="child adress";
    int yas;
    String telefon;


    public static void main(String[] args) {
        //Bir class, başka bir class'ı parent edinebilir
        // parent edindiğinde
        // 1- Child class parent class'daki tüm özelliklere sahip olur

        P04_ChildClass child1=new P04_ChildClass();

        System.out.println(child1.ulke);

        // 2- İstediğiniz özellikleri child class'a göre güncelleyebilirsini(Spesifikleştirebilirisniz)

        System.out.println(child1.isim);
        System.out.println(child1.adres);

        //3-İstersek parent class'da olmayan yeni özellikler ekleyebilliriz

        child1.yas=44;
        child1.telefon="212563987";


    }

}
