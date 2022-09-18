package day09_TernaryOperator;

import java.util.Scanner;

public class Test05_Nested1 {
    public static void main(String[] args) {

        // kullanıcıdan tamsayi isteyin sayi 10 dan kucukse rakam
        //100 den kucukse iki basamaklı sayi degilse
        //uc basamakli veya daha buyuk sayı yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi = scan.nextInt();

        String sonuc= (sayi<10) ? ("rakam"):
                ((sayi<100) ? "iki bsamakli sayi" : "uc basamakli veya daha buyuk");
        System.out.printf(sonuc);




    }
}
