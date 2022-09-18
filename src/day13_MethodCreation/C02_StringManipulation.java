package day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {


        //sifre girmesini isteyin
        //ilk harf buyuk olmalı
        //son harf kucuk olmalı
        //sifre bosluk icermemeli
        //sifre uzunlugu 8 karakter olmali

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");
        String sifre=scan.nextLine();
        int kontrol=0;


        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;

        }else {
            System.out.println("ilk harf buyuk olmalı");
        }
        if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else {
            System.out.println("son harf kucuk olamalı");

        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }else {
            kontrol++;

        }
        if (sifre.length()>=8){
            kontrol++;

        }else {
            System.out.println("sifre en az 8 karakter olamalı");
        }

        if(kontrol==4){
            System.out.println("sifre basarili");
        }else {
            System.out.println("islem basarisiz");
        }

    }
}
