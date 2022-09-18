package day35_inheritanceConstructorKullanimi;

public class AGrandParent {


    protected String isim="Grandpa ismi belirtilmedi";

    /*
    her classta gorulmese bile bir constructor varir
    bu classtan obje olusturmak iztedigimizde default
    constructor devreye girecektir.

    default constructor'i gozlemleyemeyecegimiz icin onun yerine kullanilabilecek parametresiz constructor
    olusturalim
     */

    protected String grandpaKlupAdi="grandpa Klubu";

    public AGrandParent() {
        System.out.println("Grandpa constructor calisti");
    }
}
