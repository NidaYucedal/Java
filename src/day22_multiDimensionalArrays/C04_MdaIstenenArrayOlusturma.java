package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayOlusturma {
    public static void main(String[] args) {

        //Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki
        // tum elemanlarin toplamini  birer birer bulan ve
        // herbir sonucu yeni bir array’in elemani yapan ve
        // yeni array’i  ekrana  yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
        // Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}


        int[][] input = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] yeniArr = new int[input.length];
        int toplam = 0;

        for (int i = 0; i < input.length; i++) { //dis loop outer arrayi kontrol eder
            for (int j = 0; j < input[i].length; j++) { // ic loop inner arrayleri kontrol eder
                toplam += input[i][j];


            }
            yeniArr[i] = toplam; //inner loop bitii yeni arrayi toplama koyduk toplmai sifirladik
            toplam = 0;
        }
        System.out.println("istnen yeni Array: " + Arrays.toString(yeniArr));

    }
}
