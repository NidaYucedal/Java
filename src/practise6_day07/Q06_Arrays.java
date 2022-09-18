package practise6_day07;

import java.util.Scanner;

public class
Q06_Arrays {
    public static void main(String[] args) {




       /*
       kullanıcının girdigi bir array'in en buyuk elemani ile
       en kucuk elemanının  farkını bulan bir method create ediniz.
       */


        int[] [] sayilar = {{1,2,3,4,5,6,7,},{1,2, 3, 4, 5,9}};
        int minSayi = sayilar[0][0];
        int maxSayi = sayilar[0][0];

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (sayilar[i][j] < minSayi){
                    minSayi = sayilar[i][j];

                }
            }
        }


        for (int i = 0; i < sayilar.length; i++) {
            for (int j=0; j< sayilar[i].length;j++){
                if (sayilar[i][j]>maxSayi){
                    maxSayi = sayilar[i][j];
                }
            }

        }


        System.out.println("minSayi = " + minSayi);
        System.out.println("maxSayi = " + maxSayi);
        System.out.println("maxSayi-minSayi = " + (maxSayi-minSayi));


    }
}
