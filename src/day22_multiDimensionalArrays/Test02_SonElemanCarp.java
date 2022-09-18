package day22_multiDimensionalArrays;

public class Test02_SonElemanCarp {
    public static void main(String[] args) {

        // verilen mda ic arraylerindeki son elemanlarinin carpimini ekrana yazdıran bir program yaziniz

        int[][] sayilar = {{1, 2, 3}, {4, 5}, {6}};
        int carpim = 1;


        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++ ) {
                if (j == sayilar[i].length - 1) {
                    carpim *= sayilar[i][j];
                }
            }
        }


        System.out.println("Array'in son elemanlari carpimi:" + carpim);


    }
}
