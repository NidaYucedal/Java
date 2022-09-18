package day16_forLoop;

import java.util.Scanner;

public class Test04_Loop {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyin
        //girilren sayi ve aralarındaki tüm tamsayilari toplayıp sonucu yazdirian bir program

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int sayi1 = scan.nextInt();
        System.out.print("bir sayi daha giriniz:");
        int sayi2 = scan.nextInt();

        int toplam=0;
        for (int i = sayi1; i <= sayi2; i++) {
            System.out.println(i);
            toplam +=i;
        }
        System.out.println("Girilen sayıların arasındaki sayıların toplamı : " + toplam);


    }

}