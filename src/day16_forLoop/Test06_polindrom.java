package day16_forLoop;

import java.util.Scanner;

public class Test06_polindrom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String kelime = scan.nextLine();

        palindrom(kelime);
    }



    public static void palindrom(String kelime) {
        String yenikelime = "";
        for(int i = (kelime.length()-1); i >= 0; i--) {
            yenikelime += kelime.charAt(i);
        }
        if(yenikelime.equals(kelime)) {
            System.out.println("Girilen kelime Palindrom bir kelimedir.");
        }
        else {
            System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
        }
    }
}



