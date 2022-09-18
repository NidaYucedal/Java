package day09_TernaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        int y = 112;
        System.out.println((y > 5) ? ("inek") : ("koyun"));

        //Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double sayi = scan.nextDouble();
        System.out.println(sayi >= 0 ? sayi : (-1 * sayi));


    }
}
