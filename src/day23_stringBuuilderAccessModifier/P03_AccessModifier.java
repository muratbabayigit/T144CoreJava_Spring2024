package day23_stringBuuilderAccessModifier;

public class P03_AccessModifier {
   int defSayi=10;  //java access modifier olarak default atadı
    // default int sayi2=10; default gorunur olarak atanamaz
    private int privSayi=20;
    protected int ProSayi=30;
    public int publicSayi=40;

    public static void main(String[] args) {
        P03_AccessModifier obj=new P03_AccessModifier();

        //Private access modifier'a sadece içinde bulunduğu class 'tan ulaşılabilir
        //Private-----> Pazaralama birimi dışındakiler göremez
        System.out.println(obj.privSayi);
        obj.privSayi=25;
        obj.methodPriv();

        //Default access modifier'a içindebulunduğu class ve package'dan ulaşılabilir

        System.out.println(obj.defSayi);
        obj.defSayi=15;
        obj.methodDefault();


        System.out.println(obj.ProSayi);
        obj.ProSayi=35;
        obj.proMethod();
    }

    protected void proMethod() {
        System.out.println("Protected mehod çalıştı");
    }

    void methodDefault() {
        System.out.println("Default method çalıştı");
    }


    private void methodPriv() {
        System.out.println("Private method çalıştı");
    }





}
