package day23_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler);
        //indexOf methodu bize bilgi donduren bir methodtur
        //listemizi degistirmez

        System.out.println(urunler.lastIndexOf("Ikram"));
        //lastindexof methodu aramaya son indexten baslar
        //arama bitip urunu bulundugunda ikiside bulunan urunun indexini verir,


        urunler.add("Ikram");
        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler);
        System.out.println(urunler.lastIndexOf("Ikram"));

        System.out.println(urunler.indexOf("Hobby"));//-1 doner
        System.out.println(urunler.lastIndexOf("Hobyy"));//-1 doner






    }
}
