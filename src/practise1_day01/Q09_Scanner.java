package practise1_day01;

import java.util.Scanner;

public class Q09_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isminiz");
        String isim= scan.nextLine();

        System.out.println("memleketiniz");
        String memleket=scan.nextLine();

        System.out.println("konum");
        String konum=scan.nextLine();

        System.out.println("yas");
        int yas=scan.nextInt();

        System.out.println("boy");
        double boy=scan.nextDouble();

        System.out.println("yasadıgınız:"+ konum + "u seviyor musunuz? true/false");
        boolean seviyorMu= scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

        if (seviyorMu == true) {
            System.out.println("isim = " + isim);
            System.out.println("memleket = " + memleket);
            System.out.println("konum = " + konum);
            System.out.println("yas = " + yas);
            System.out.println("boy = " + boy);
            System.out.println("seviyorMu = " + seviyorMu);
        }else{
            System.out.println("yaşadigi yeri sevmiyor");
        }










    }
}
