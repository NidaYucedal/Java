package day09_TernaryOperator;

import java.util.Scanner;

public class Test01_AyBul {
    public static void main(String[] args) {
        // kullanicidan kacinci ay oldugunu sorun
        // ve ay ismini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 den 12 ye kadar bir ay giriniz");
        int ay = scanner.nextInt();

        switch (ay) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("gecersiz");


        }
    }
}
