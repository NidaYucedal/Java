package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        //list pirimitive data turlerini kabul etmez

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);// 5 3 10 7
        System.out.println(sayilar);
        //sadece add kullanirsak java sona ekler

        sayilar.add(2,10); //indexi 2 olan yere 10 elementini ekleyelim
        System.out.println(sayilar);


    }
}
