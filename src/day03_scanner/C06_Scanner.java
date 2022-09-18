package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //isim soyisim yas yazdir//

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("lutfen soyisim giriniz");
        String soyisim=scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("girilen bilgiler= "+isim+" "+soyisim+" "+yas );

        }
    }
