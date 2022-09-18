package day07_IfStatement;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

        // bir onceki soruda kullanici negatif deger girerse uyaralım


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        if (yas<0) {
            System.out.println("lutfen gecerli bir yas giriniz");
        } else if (yas<65) {
            System.out.println("emekli olamazsin, " + (65 - yas) + " yil daha calismalisin");
        } else {
            System.out.println("emekli olabilirsin");
        }


    }
}
