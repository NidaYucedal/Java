package day08_ifStatement;

import java.util.Scanner;

public class C03_IfElseStatement {
    public static void main(String[] args) {

        //kullanicidan maas icin teklif isteyin asagidaki degerlere gore cevap yazidirin
        //teklif 80 binin uzerinde ise kabul ediyorum
        //60-80 bin arasinda ise "Konusabiliriz"
        //60 binin altinda ise maalesef "Kabul edemem"

        Scanner scan=new Scanner(System.in);
        System.out.println("maas icin teklif giriniz");
        int maas= scan.nextInt();

        if (maas>=80000 ){
            System.out.println("kabul ediyorum");

        } else if (maas>=60000 && maas<=80000 ){
            System.out.println("Konusabiliriz");
        } else if (maas<6000){
            System.out.println("Kabul edemem");

        }else {
            System.out.println("Kabul edemem");
        }
    }
}
