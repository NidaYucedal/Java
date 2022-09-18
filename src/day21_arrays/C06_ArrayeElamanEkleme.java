package day21_arrays;

import java.util.Arrays;

public class C06_ArrayeElamanEkleme {
    public static void main(String[] args) {

        // C05 deki methodu kullanrak array eleman ekle

        String[]takimListesi={"süleyman", "osman"};
        String eklenecekIsim="talha";

        takimListesi=C05_ArrayElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));

    }
}
