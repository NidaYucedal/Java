package day20_scopeArrays;

import java.util.Arrays;

public class C04_ElemanlarıYazdırma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7,};

        //Array in tamamını yazdıralım

        System.out.println(Arrays.toString(sayilar));

        //Array'in tum elementlerini yazdirin

        for (int i=0; i<sayilar.length; i++) {
            System.out.print(sayilar[i]+" ");


        }
    }
}
