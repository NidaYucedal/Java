package practise2_day03;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("cumlu olusturmak icin birici giriniz");
        String str1 = scan.next();
        System.out.println("cumlu olusturmak icin ikinci giriniz");
        String str2 = scan.next();
        System.out.println("cumlu olusturmak icin ucuncu giriniz");
        String str3 = scan.next();
        System.out.println("cumlu olusturmak icin dorduncu giriniz");
        String str4 = scan.next();


        System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1) +
                " " + str2 + " " + str3 + " " + str4 + ".");


    }
}
