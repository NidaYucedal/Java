package day35_inheritanceConstructorKullanimi;

public class BParent extends AGrandParent {

    protected String isim="parent isim belirtilmedi";
    protected String parentKlupAdş="parent klubu";

    public BParent() {
        System.out.println("Parent constructor calisti");
    }
}
