package day07_IfStatement;

import java.util.Scanner;

public class Test01_IfTamsayi {
    public static void main(String[] args) {
          // kullanıcıdan aldıgımız sayıyının cift olmasını bulmamız icin 2 ye bölüp %
          // == 0 a esitliyoruz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int tamsayi=scan.nextInt();

        if (tamsayi%2==0) {
            System.out.println("Girilen sayi cifttir");

        }
        else {
            System.out.println("Girilen sayi tektir");
        }


    }
}
