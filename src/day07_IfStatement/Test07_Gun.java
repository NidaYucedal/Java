package day07_IfStatement;

import java.util.Scanner;

public class Test07_Gun {
    public static void main(String[] args) {

        /*
        Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
                isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
                gecerli degilse “Gecerli gun ismi giriniz” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz:");
        String gun=scan.next().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("carsamba")|| gun.equals("persembe")
                || gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar ") ) {

            System.out.println(""+gun.toUpperCase().charAt(0)+""
                    +gun.toLowerCase().charAt(1)+""+gun.toLowerCase().charAt(2));

        }else {
            System.out.println("Gecerli gun ismi giriniz");


        }



    }}
