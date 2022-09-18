package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /* kullanıcıdan 2 sayi al carpımını yaz */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi girin");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen 2. sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("girilen sayilarin carpimi " + sayi1*sayi2 );

    }
}
