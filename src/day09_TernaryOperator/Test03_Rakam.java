package day09_TernaryOperator;

import java.util.Scanner;

public class Test03_Rakam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();


        switch (sayi) {
            case 10:
                System.out.println("iki basmakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayı");
                break;
            case 1000:
                System.out.println("dort basamaklı en kucuk sayi");
                break;
            default:
                System.out.println("gecersiz");


        }
    }
}
