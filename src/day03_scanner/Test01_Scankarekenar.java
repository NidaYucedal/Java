package day03_scanner;

import java.util.Scanner;

public class Test01_Scankarekenar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen karenin kenar uzunlugunu giriniz");
        double kenar=scan.nextDouble();
        System.out.println("karenin cevresi:"+ kenar*4 );
        System.out.println("karenin alanı:"+ kenar*kenar);







    }
}
