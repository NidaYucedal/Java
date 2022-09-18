package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer, String> sinifList = new HashMap<>();

        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Emine, Cam, Java");
        sinifList.put(104, "Nida, Sena, Tester");
        System.out.println(sinifList);
        //key ler unique olmali
        //cunku elemnalar keylere gore store edilir


        System.out.println(sinifList.keySet()); //[101, 102, 103, 104]
        System.out.println(sinifList.values()); //[Ali, Can, JDev, Enes, Cem, Tester, Emine, Cam, Java, Nida, Sena, Tester]

        System.out.println(sinifList.values().size()); //4


        //tum ogrencilerin isim ve soyisimlerini  sira no ile alt alta yazdirin

        Collection<String> tumValueColl = sinifList.values();

        String[] eachArr;
        int sira = 1;

        for (String each : tumValueColl) {
            //buradaki each her bir ogrenciye ait ayni yapidaki
            //isim, soyisim, brans bilgilerini iceren String ler getiriyor

            eachArr = each.split(", ");

            //System.out.println(Arrays.toString(eachArr));
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);
            sira++;
        }

        //Map de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek bir siniif listesi olusturun

        List<String> sinifIsimSoyisimList = new ArrayList<>();

        for (String each : tumValueColl
        ) {
            eachArr = each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }

        System.out.println(sinifIsimSoyisimList);

    }
}