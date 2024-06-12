package day28_PolymorphismAbstractionInterface;

public class P03_ChildofKuralciOlmayanParent extends  P02_KuralciOlmayanParent{


    public static void main(String[] args) {
        /*
        Normal bir child-Parent ilişkisinde
        Child Class parent class'daki methodlardan
            - istediğini direk parent'taki haliyle kullanır
            - istediğini değiştirip/guncelleyimp kullanır
            - isterse de parent'ta olmayan yeni bir method oluşturabilir.

         */

        P03_ChildofKuralciOlmayanParent obj=new P03_ChildofKuralciOlmayanParent();
        obj.method1();
    }
}
