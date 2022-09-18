package day21_arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        //binary search methodu siralanmis arrayde aradigimiz elementin indexini dondurur
        //ya aradigimiz element arrayde yoksa
        //string de indexOf() bize olmayan elementler icin -1 donduruyordu
        //aradigimiz element arrayde yoksa java hem olmadigini hemde olsaydi nerede
        //olacagini bize dondurur,olmadigini ifade icin  - kullanir
        //olsaydi nerede olacagini belirtmek icin index degil siralama kullanir


        int[] sayilar = {3, 7, 15, 4, 27, 10,};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.binarySearch(sayilar, 4));
        System.out.println(Arrays.binarySearch(sayilar, 15));
        System.out.println(Arrays.binarySearch(sayilar, 11));
        System.out.println(Arrays.binarySearch(sayilar, 6));
        System.out.println(Arrays.binarySearch(sayilar, -100));

    }
}
