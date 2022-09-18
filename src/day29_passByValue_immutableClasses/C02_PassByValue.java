package day29_passByValue_immutableClasses;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        birden fazla element iceren array ve arrayList gibi yapilarda da passByValue gecerlidir.

        eger method da array veya list'in kendisi degistirilirse passByValue ozelligi sebebiyle java degisen
        degeri degil Lis'in orjinal degerini alır

        ancak array veya list degistirlimaden sadece icindeki elemanlar degistirlirse jav aobje degismedigi
        icin (referans ayni)ayni array veya list'i bize dondurur
        ancak icindeki elementler degismis olcaktir

         */


        /*
        verilen 4 elemanli bir array i method'a gonderelim
        method'da yen uc elemanli array atayip
        bu yeni Array'e rastgele 100 den kucuk uc sayi atayalım
        method'da arrayi yazdiralim
        main method'da da method call dan sonra yeniden methodu yazdiralim
         */

        int[] arr = {3, 5, 8, 10};
        arrayDegistir(arr);

        System.out.println("method call dan sonra main method'da array "+ Arrays.toString(arr));

    }

    public static void arrayDegistir(int[] arr) {

        arr = new int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);

        System.out.println("method'da array "+ Arrays.toString(arr));
    }
}
