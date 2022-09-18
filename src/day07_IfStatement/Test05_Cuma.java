package day07_IfStatement;

import java.util.Scanner;

public class Test05_Cuma {
    public static void main(String[] args) {

          /*
        Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
                gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
                ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir gun girin");
        String gun=scanner.next().toLowerCase();

        if (gun.equals("pazar")) {
            System.out.println("hristiyanlar ıcın kutsal gun");

        } else if (gun.equals("cuma")) {
            System.out.println("muslumanlar ıcın kutsal gun");

        } else if (gun.equals("cumartesi")){
            System.out.println("yahudiler icin  kutsal gun");
        }
        else {
            System.out.println("kutsal gun degildir");}
    }
}
