package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {


        //verilen bir stringdeki kullanilan harfleri
        //ve kullanilan harflerin tekrar sayisini
        //H=20 seklinde yazdirin

        String str = "Heeeeellllooooo Woooorrrrllllllddddd";
        //spaceleri saymammasi icin onlari yok edelim
        str = str.replaceAll("\\W", "");

        String[] harf = str.split("");
        System.out.println(Arrays.toString(harf));

        //harfleri key kullanim adedini value yapalim
        //bir map olusturalim

        Map<String, Integer> harfKullanimSayilariMap = new TreeMap<>(); //sirali veriyor


        Integer harfKullanimSayisi;

        //tum harflerimiz array de bunları sirasiyla alıyoruz
        //kontrol ediyoruz eger harfkullanımmapinde H harfi yoksa
        //o zaman H harfini alıp 1 olarak ekliyoruz
        for (String each : harf) {

            if (!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each, 1); //harflerin yanında 1 yazar sout da


            } else { //harften 1 den fazla varsa update edelim
                harfKullanimSayisi=harfKullanimSayilariMap.get(each);
               harfKullanimSayilariMap.put(each,++harfKullanimSayisi);

            }
        }


        System.out.println(harfKullanimSayilariMap);

    }
}
