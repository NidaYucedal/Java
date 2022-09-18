package day03_scanner;

import java.util.Scanner;

public class Test03_Charbuyukharf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(1);
        System.out.println("isminiz:"+ ilkHarf);

    }
}
