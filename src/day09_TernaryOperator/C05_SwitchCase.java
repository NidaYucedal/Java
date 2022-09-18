package day09_TernaryOperator;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        // kullanicidan gun numarasini alip
        // 1 ise pazartesi,...
        // 7 ise pazar yazdıralım


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan.nextInt();

        // switch yanina yazılan () neye gore case atayacagimizi gosterir

        switch (gunNo) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("bunlardan biri degil");


        }
    }
}
