package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkHarf = scan.next().toLowerCase().charAt(0);
        System.out.println("ismin ilk harfi: " + ilkHarf);

        System.out.println("lütfen iki isim giriniz");
        char harf = scan.next().toUpperCase().charAt(0);
        char harf2 = scan.next().toLowerCase().charAt(1);
        System.out.println("isminizin 1. ve 2. harfi:" + harf + harf2);

        String kisi = "nidak";
        char cinsiyet = kisi.charAt(4);
        System.out.println(kisi+" ile temsil edilen kişinin cinsiyeti: "+cinsiyet);

        char cevap = 'D';
        if(cevap == 'Y') {
            System.out.println("Soruyu Doğru Cevapladınız!");
        } else {
            System.out.println("Soruyu Yanlış Cevapladınız!");
        }




    }
}
