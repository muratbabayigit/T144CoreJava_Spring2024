package day24_accessModifierEncapsulation;

public class P03_RaporClass {
  private int satisTutari;
  private int toplamSatisTutari;




    /*
    ISTENEN GÖREV:
      Bir rapor hazırlanması isteniyor;
        1- Satış tutarları bilgisi nbaşka departmanlar tarafından görülemesin
           Ama bunlara her departman kendinde var olan bilgiliyi atayabilsin(değiştirebilsin)
        2- Toplam satış tutarı üzernde değişiklik yapılamasın ama
           bu tutar değeri görütntülenebilsin.

        Bu işlemdeki okuma(read) ve yazma (write) yetkileri access modifier ile yapılamaz
        Daha net ifade etmek istersek ya ikisini birden verip ya da hiç vermeden işlem yapılır
        Bu iki yetki birbirinden ancak Encapsulation kullanılark ayrılır
     */

  /*
  Encapsulation işlemi 2 adımda yapılır;
    1- Access modifier private yapılarak erişimin engellenmesi sağanır
    2- Sınırlı işlem yapabilsin
      - değer atanabilsin ama
         sonucları veya deer verileri göremesin SET

      - değer atayamasın ama sonuçları (GET)
        veya verileri görüntüleyebilsin
   */

  public int getToplamSatisTutari() {

    return toplamSatisTutari;
  }

  public void setSatisTutari(int satisTutari) {
    this.satisTutari = satisTutari;
    toplamSatisTutari += satisTutari;
  }

  public void setToplamSatisTutari(int toplamSatisTutari) {
    this.toplamSatisTutari = toplamSatisTutari;

  }

  public int getSatisTutari() {
    return satisTutari;

  }
}
