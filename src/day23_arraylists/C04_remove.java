package day23_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        //remove methodu iki sekilde kullanilir
        //1-objeyi yazıp silmesini istersek bize boolean sonuc doner
        //2-index girersek o indexteki elemani siler ve bize silinen elemani dondurur

        System.out.println(urunler);
        System.out.println(urunler.remove("Cay"));//true
        urunler.remove("Ikram");
        System.out.println(urunler.remove("Hobby"));//false
        System.out.println(urunler);

        System.out.println(urunler.remove(1));//index 1 oolani silecek ve getirecek
        System.out.println(urunler);


        //olamayan bir indexi yazarsak run time error verir



    }
}
