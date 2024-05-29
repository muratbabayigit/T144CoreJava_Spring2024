package day18_Constructor;

public class P04_ConstructorVsMethods {

    /*
    Constructor'lar syntax olarak methodlara benzerler
    bir kod bloğundun constructor olabilmesi için
    2 temel şartı aynı anda taşıması gerekir
        1-İsmi Class ismi ile aynı olmalıdır
        (büyük harfla başlamalıdır ve class ismi ile birebir aynı olmalıdır)
        (method isimleri küçük harfle başlar, Büyük harfle tanımlanırsa CTE vermez. Ama önerilen bir seçenek değildir)
        (Method ismi ile class ismi aynı olabilir. CTE vermez. Ama önerilen bir seçenek değildir)

        2- Return Type olmaz

     */

    public void P04_ConstructorVsMethods() {
        //Method name 'P04_ConstructorVsMethods' is the same as its class name

    }

    public  P04_ConstructorVsMethods() {}


  // public Deneme(){ //Invalid method declaration; return type required
  //     // Constructor değil -----> class ismi ile aynı değil
  //     // Method değil ------> return type yok

  // }
}
