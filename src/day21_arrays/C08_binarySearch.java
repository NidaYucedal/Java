package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        //binary search java da eleman aramanın kısa yoludur.
        //ancak binarySearch çalıimasi icin once array ın sirali hale gelmesi gerekir
        //eger sirlama olmadan binary search yaparsak sonucu bulamayabilir veya yanlis bulabilir

        String[]harfler={"Y","B","D","G","O","A"};

        String arananHarf="Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));

        System.out.println(C03_Contains.contains(harfler,arananHarf));


        //binary search bize aradigimiz elemanin indexini dondurur
        //array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmak gerekir

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));


    }
}
