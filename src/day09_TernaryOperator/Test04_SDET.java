package day09_TernaryOperator;

import java.util.Scanner;

public class Test04_SDET {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("SDET harflerinden birini giriniz:");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        switch (ilkHarf) {
            case 'S':
                System.out.printf("SOFTWARE");
                break;
            case 'D':
                System.out.printf("DEVELOPER");
                break;
            case 'E':
                System.out.printf("Engineer");
                break;
            case 'T':
                System.out.printf("In Testing");
                break;
            default:
                System.out.printf("gecersiz");

        }
    }
}
