package day35_inheritanceConstructorKullanimi;

public class Child extends BParent {


    String isim="child isim belirtilmedi";
    protected String chihKlupAdi="Child klubu";


    public Child() {

        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

        AGrandParent gp1=new AGrandParent();


        //bu objeyi olusutrmak icin granparent cons calisir
        //parent ve child calismaz

        Child c1=new Child();
        c1.grandpaKlupAdi="Child1";
        c1.parentKlupAdş="Child2";

        //c1 objesi icin chil constructor calisti

        /*
        javada bir classı kullanabilmek icin
        o class dan obje olusturur dolayisiyla
        o classın constructor'ini kullanirdik

        java inheritance da parent classlardaki ozellkleri
        kullanabilmek icn o classlarin constructorlarini otomatik calistiran bir yapi kurmustur

        orn: biz child classında yine child classından bir obje olusturmak istedigimizde child constructorlarini
        kullaniriz

        java child constructorini gordugunde once parentin cons calistirmam lazim der
        buradan parent constructor'a gider parent classında parent constructorini gorunce
        once bunun parentini yani grandparent constructor calismasi gerekir der

        boylece extends keyword olmayan classa kadar gider ve oradan baslayarak
        tum constructorlari asagi dogru calistirir

         */



    }
}
