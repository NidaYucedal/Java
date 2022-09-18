package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplamıModulus {
    public static void main(String[] args) {
        // Kullanicidan 4 basamaklı sayi al
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = sayi;


        // suanda sayi 5267 birlerbasamagi 0 rakamlart 0

        birlerBasamagi = sayi % 10; // 7 birlerbasamagi
        rakamlarToplami += birlerBasamagi;
        sayi /= 10; //sayiyi 10 a bolup sayıyı ına atıyor


        //sayi suan 526 bb 7 rt 7

        birlerBasamagi = sayi % 10; //bb 6
        rakamlarToplami += birlerBasamagi; // rt 13

        sayi /= 10; // suan sayi 52 bb 6 rt 13

        birlerBasamagi = sayi % 10; // bb 2
        rakamlarToplami += birlerBasamagi; //13+2=15
        sayi /= 10; // 5

        // suan sayi 5 bb 2 rt 15

        birlerBasamagi = sayi % 10; // 5
        rakamlarToplami += birlerBasamagi; // rt 20
        sayi /= 10; // 0 oldu

        System.out.println(ilkGirilenSayi + " sayinin rakamlar toplami: " + rakamlarToplami);



    }
}
