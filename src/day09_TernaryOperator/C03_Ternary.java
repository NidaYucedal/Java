package day09_TernaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        //sayi pozitifse sayiyiy yazdirin
        //sayi negatifse bir sayi daha isteyin ve ikisinin carpimini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi > 0) {
            System.out.println(sayi);
        } else {
            System.out.println("lutfen bir sayi daha giriniz");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi * sayi2);
        }
        // eger if else icerisinde yeni kodlar varsa ternary
        // ile yapamayız

    }
}
