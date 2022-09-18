package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {


        /* Eger bir class'İn icerisinde herhangi bir hesaplama yapip bunu da kalici olarak saklamak istersek
       kodumuzu sade ve anlasilir tutmak icin islemi bir method'da yapip
       sonucunu main methoda dondurebiliriz
       Return type'ı void olmayan bir methodun soncunu main method'da bir variable'a atama yaparsak
       programin geri kalaninda
       bu yeni degeri kullanma sansimiz olur

           */

        //kullanıcıdan sehir ismi ve dogum tarihi alalim
        //sehir ismini  buyuk harf tarihi ise 2022-06-30

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("girdiginiz sehir: " + sehir);
        System.out.println("girdiginiz tarih: " + tarih);


    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = scan.nextInt();
        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("kacinci ay oldugunu yaziniz");
        int ay = scan.nextInt();
        if (ay < 0 || ay > 12) {
            System.out.println("ay no 1-12 arasında olmali");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";

        } else {
            tarih = tarih + ay + "-";
        }

        System.out.println("lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz:");
        int gun = scan.nextInt();
        if (gun <= 0 || gun >= 31) {
            System.out.println("gun no olarak 1-31 arasi giriniz");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
            tarih = tarih + gun;
        }
        return tarih;
    }

    public static String sehirAl() {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sehir adi giriniz");
        String sehirAdi = scan.next().toUpperCase();

        return sehirAdi;


    }
}
