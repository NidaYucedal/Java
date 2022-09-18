package day21_arrays;

import java.util.Arrays;

public class C05_ArrayElementEkleme {
    public static void main(String[] args) {

        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sinifListesi = {"ali can", "nida yucedal", "musa yaman"};
        String eklenecekIsim = "murat babayigit";

        sinifListesi = elemanEkle(sinifListesi, eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String[] yeniSinifListesi = new String[sinifListesi.length + 1];

        //eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum

        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i] = sinifListesi[i];

        }

        //oncelikle eski listedeki tum elemanları,yeni listeye tasidim

        yeniSinifListesi[yeniSinifListesi.length - 1] = eklenecekIsim;

        //son indexe ise eklenecek ismi atadım

        return yeniSinifListesi;
    }
}
