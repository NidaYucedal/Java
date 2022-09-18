package day22_multiDimensionalArrays;

public class Test01_TumElemamCarpma {
    public static void main(String[] args) {

        // verilen Multi Dimensional Array'in tum elemenalarının carpımını yazdıran bir method olusturun


        int[][] sayilar = {{1, 2, 3,-2}, {4, -5, 6,3}};
        tumunuCarp(sayilar);


    }

    public static void tumunuCarp(int[][] sayilar) {

        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                carpim *= sayilar[i][j];


            }
        }


        System.out.println("tum sayilarin carpimi : " + carpim);


    }
}
