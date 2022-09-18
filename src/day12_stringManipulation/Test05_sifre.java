package day12_stringManipulation;

import java.util.Scanner;

public class Test05_sifre {
    public static void main(String[] args) {

        //sifre girmesini isteyin
        //ilk harf buyuk olmalı
        //son harf kucuk olmalı
        //sifre bosluk icermemeli
        //sifre uzunlugu 8 karakter olmali

        String sifre = "bcndida";

        if (sifre.startsWith("A")){
            System.out.println("sifre");
        } if (sifre.endsWith("a")){
            System.out.println("basarili");
        }if (!sifre.contains(" ")){
            System.out.println("dogru");

        } if (sifre.length() <=8){
            System.out.println("dogru karakter");
        }else {
            System.out.println("islem basarisiz");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("sifre giriniz");

        String sifre1 = scan.nextLine();
        char ilkharf = sifre1.charAt(0);

        int uzunluk = sifre1.length();
        char sonharf = sifre1.charAt(sifre1.length() - 1);
        if ((uzunluk < 8)) {
            System.out.println("islem basarisiz, lütfen yeni bir sifre girin");
        } else if ((ilkharf <= 'Z' && ilkharf >= 'A') && (sonharf <= 'z' && sonharf >= 'a') && (!sifre1.contains(" "))) {
            System.out.println("sifre basari ile tanimlandi");
        } else {
            System.out.println("islem basarisiz, lütfen yeni bir sifre girin");
        }
    }
}