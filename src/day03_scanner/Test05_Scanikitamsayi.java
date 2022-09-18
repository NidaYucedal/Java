package day03_scanner;

import java.util.Scanner;

public class Test05_Scanikitamsayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("luften iki tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);


    }
}
