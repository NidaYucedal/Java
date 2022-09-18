package recap2;

import java.util.Scanner;

public class Q08_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime yazınız");
        String kelime = scan.next();
        char sonIki=kelime.charAt(kelime.length()-2);
        char sonbir=kelime.charAt(kelime.length()-1);



        String sonuc = kelime.charAt(kelime.length()-2) >= 3 ? ""+sonIki+sonbir +""+ sonIki+sonbir
                + ""+ sonIki+sonbir : kelime;
        System.out.println(sonuc);








    }
}