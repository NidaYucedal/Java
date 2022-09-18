package day09_TernaryOperator;

import java.util.Scanner;

public class Test02_BuyukOlan {

    public static void main(String[] args) {

        int sayi1, sayi2;

        // sayisal değerde iki değişken tanımlıyoruz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz.");
        sayi1 = scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        sayi2 = scan.nextInt();
        System.out.printf(String.valueOf(sayi1<=sayi2 ? sayi1 : sayi2));




    }


}

