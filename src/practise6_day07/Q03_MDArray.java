package practise6_day07;

public class Q03_MDArray {
    public static void main(String[] args) {



        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */


        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int arr[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        System.out.println("ciftleriTopla(arr) = " + ciftleriTopla(arr));
    }

    private static int ciftleriTopla(int[][] arr) {
        int toplam = 0;
        for (int[] each1 : arr) { //outer for each
            for (int each2 : each1) { //inner for each
                if (each2 % 2 == 0) {
                    toplam += each2;
                }
            }
        }
        return toplam;
    }
}



