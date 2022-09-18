package practiseday12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PIslemler {

    static List<Kisi> ogretmenlist = new ArrayList<>();
    static List<Kisi> ogrencilist = new ArrayList<>();
    static String kisiTuru;
    static Scanner scan = new Scanner(System.in); //static olmasinin nedeni tum methodlardan ulasmak icin


    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;

            case "2":
                islemMenusu();
                kisiTuru = "OGRETMEN";
                break;

            case "Q":
                break;

            default:
                System.out.println("hatali giris :(");
                girisPaneli();
                break;

        }


    }

    private static void islemMenusu() {
        System.out.println("sectigin kisi turu " + kisiTuru + " lutfen asagidaki isimleri seciniz");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");


        System.out.println("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                //arama();
                islemMenusu();
                break;
            case 3:
                //listeleme();
                islemMenusu();
                break;
            case 4:
                //silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();//yani ana menu
                break;
            case 0:
                //cikis();
                break;
            default:
                System.out.println("guzel birsey gir");
                islemMenusu();
                break;


        }


    }

    private static void ekle() { //bu method hem ogrenci hem de ogretmen icin tasarlandi

        System.out.println("****** " + kisiTuru + " eklme sayfasina hosgeldin ");

        System.out.println("isim soyisim gir");
        String adSoyad = scan.nextLine();

        scan.nextLine();

        System.out.println("kimlik gir");
        String kimlikNo = scan.nextLine();

        System.out.println("yas gir");
        int yas = scan.nextInt();

        scan.nextLine();



        if (kisiTuru.equals("OGRETMEN")) { //TODO sonra doldur


        } else {

            System.out.println("bolum giriniz");

            String bolum = scan.nextLine();



            System.out.println("sicil no giriniz: ");

            int sicilNo = scan.nextInt();


            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmenlist.add(ogretmen);

            System.out.println(ogretmenlist);


        }if (kisiTuru.equals("OGRENCI")){

        }else {

            scan.nextLine();
            System.out.println("ogrenci no giriniz");
            String ogrenciNo=scan.nextLine();


            scan.nextLine();

            System.out.println("sinif no giriniz ");
            String sinif= scan.nextLine();

            Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
            ogrencilist.add(ogrenci);

            System.out.println(ogrencilist);
        }


    }

}
