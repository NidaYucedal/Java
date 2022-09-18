package day24_arrayLists_ForEachLoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01_arrays {
    public static void main(String[] args) {


        //  "Integer sayılardan oluşan bir diziyi parametre olarak alan
        //  ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
        //  aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
        //Örnek çıktı:
        //[1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
        //[8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
        //[2, 55, 60, 97, 86] ➞ "Boom!"


        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {8, 6, 33, 100};
        int[] nums3 = {2, 55, 60, 97, 86};
        int arananRakam = 7;






        System.out.println(rakamDizideVarMi(nums1, arananRakam));
        System.out.println(rakamDizideVarMi(nums2, arananRakam));
        System.out.println(rakamDizideVarMi(nums3, arananRakam));
    }


    public static String rakamDizideVarMi(int[] arr, int arananRakam) {

        String sonuc;
        int basamak;
        List<Integer> tumSayilar = new ArrayList<>();



        for (int i : arr) {
            while (i != 0) {
                basamak = i % 10;
                tumSayilar.add(basamak);
                i = i / 10;
            }
        }

        if (tumSayilar.contains(arananRakam)) {
            sonuc = "Boom!";
        } else {
            sonuc = "Dizide " + arananRakam + " rakamı yok";
        }

        for (int i = 0; i < tumSayilar.size();i++)
        {
            System.out.print(tumSayilar.get(i));

        }


        return sonuc;
    }
}
