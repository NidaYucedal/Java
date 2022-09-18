package day08_ifStatement;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {

        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        //50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
        // gecersiz not girildiginde uyari verelim


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 100 uzerinden bir not giriniz:");
        double not = scan.nextDouble();

        if (not >= 0 && not <= 49) {
            System.out.println("not:" + "D");

        } else if ((not >= 50 && not <= 59)) {
            System.out.println("not:" + "C");
        } else if (not >= 60 && not <= 79) {
            System.out.println("not:" + "B");

        } else if (not >= 80 && not <= 100) {
            System.out.println("not:" + "A");

        } else {
            System.out.println("gecerli bir not giriniz");
        }

    }
}
