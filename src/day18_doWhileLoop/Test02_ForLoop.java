package day18_doWhileLoop;

import java.util.Scanner;

public class Test02_ForLoop {
    public static void main(String[] args) {

       //girilen cumlede bir kelimenin kac harf oldugunu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print("Cümleyi Girin :");
        String cumle = scan.nextLine();
        System.out.print("Aratmak İstediğiniz Kelimeyi Girin :");
        String kelime = scan.nextLine();

        int cumleuzun = cumle.length();
        int kelimeuzun = kelime.length();
        int toplam = 0;
        for (int i = 0; i <= cumleuzun - kelimeuzun; i++) {
            String kes = cumle.substring(i, i + kelimeuzun);

            if (kes.equals(kelime)) toplam++;
        }
        System.out.println(kelime + " Cümlede  " + toplam + " adet vardır");
    }
}

