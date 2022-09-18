package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MdaTumElemtleriYazdirma {
    public static void main(String[] args) {

        //verilen bir mda tum elementlerini yazdiran bir method olustrun

        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};
        elementleriYazdir(sayilar);

    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) { // i=0,1,2 degerlerini alacak
            for (int j = 0; j < sayilar[i].length; j++) { // inner arraylerin uzunluguna bagladik
                System.out.print(sayilar[i][j] + " ");

            }
        }


    }
}
