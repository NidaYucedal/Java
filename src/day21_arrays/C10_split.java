package day21_arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {

        //split methodu bir array methodu degil
        //string methodudur ama array dondurur
        //split ile herhangi bir stringi istedigimiz sekilde parcalara boleriz

        String str = "java, ne kadar guzel.";
        String[] kelimeler = str.split(" ne");
        System.out.println(Arrays.toString(kelimeler));

        String[] karakter = str.split("");
        System.out.println(Arrays.toString(karakter));

    }
}
