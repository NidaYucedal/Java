package day03_scanner;

import java.util.Scanner;

public class Test06_Scankarekenaruzunluk {
    public static void main(String[] args) {
        // kullanicidan karenin bir kenar uzunlugu alin ve karenin cevresini hesaplayın
        Scanner scan=new Scanner(System.in);
        System.out.println("luften karenin kenar uzunlugunu giriniz");
        double kenar= scan.nextDouble();
        System.out.println("karenin cevresi:" + kenar*4);
        System.out.println("karenin alanı:" +kenar*kenar);


    }
}
