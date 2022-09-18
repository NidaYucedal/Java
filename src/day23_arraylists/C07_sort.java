package day23_arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler);//[Cay, Cekirdek, Ikram, Nutella]

        //list ile gelen sort methodunda siralama ozelligini girmek gerekiyor
        //bunun yerine Collections classından sort methodunu kullaniyoruz
        //bu method listemizi natural order a gore siralar(alfabetik siraladi)
        //clear methodu temizliyor


    }
}
