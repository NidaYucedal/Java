package day03_scanner;

import java.util.Scanner;

public class    Test02_Scandik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenin uzun kenarini giriniz");
        double uzunkenar=scan.nextDouble();
        System.out.println("lutfen dikdortgenin kısa kenarini girinz");
        double kisakenar=scan.nextDouble();
        System.out.println("lutfen dikdortgenin yuksekligini giriniz");
        double yukseklik= scan.nextDouble();
        System.out.println(uzunkenar*kisakenar*yukseklik);


    }

}
