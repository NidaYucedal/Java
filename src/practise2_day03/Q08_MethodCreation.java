package practise2_day03;

import java.util.Scanner;

public class Q08_MethodCreation {
    public static void main(String[] args) {

         /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");

        System.out.print("Secimininizi giriniz: ");
        int secim = scan.nextInt();

        switch(secim) {
            case 1:
                System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma isleminin sonucu = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölme isleminin sonucu = " + (float)sayi1 / sayi2);
        }
    }
}
