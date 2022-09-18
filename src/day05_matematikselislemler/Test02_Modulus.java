package day05_matematikselislemler;

import java.util.Scanner;

public class Test02_Modulus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kullanıcıdan 3 basamakli sayi al");
        int sayi = scan.nextInt();


        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = sayi;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
        System.out.println(sayi);

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
        System.out.println(sayi);


        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;
        System.out.println(sayi);

        System.out.println(ilkGirilenSayi + " sayinin rakamlar toplami: " + rakamlarToplami);



    }
}
