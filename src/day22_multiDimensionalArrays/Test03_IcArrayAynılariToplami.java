package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test03_IcArrayAynılariToplami {
    public static void main(String[] args) {

        //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
        // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        // arr1[]={{1,2},{3,4,5}{6}}
        // arr2[]={{7,8,9},{10,11},{12}}


        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int[] yeniArray = new int[arr1.length];
        int indexToplam = 0;
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++) {
                if (i == j) {
                    indexToplam += arr1[i][j] + arr2[i][j];
                }

            }
            System.out.println(i + ". index elemanların toplamı : " + indexToplam); //0. index elemanlar�n toplam� : 18
            //1. index elemanlar�n toplam� : 28
            //2. index elemanlar�n toplam� : 18
            indexToplam = 0;
        }
    }
}


