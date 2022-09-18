package day14_MethodCreation;

import java.util.Scanner;

public class Test06_MethodCreation {
    public static void main(String[] args) {

        // Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini girerse,
        //          kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
        //          Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
        //          "Cok sayi girdiniz, ben toplayamam" yazdirin


        int sayi=0;

        sayiToplami(sayi);

    }

    public static int sayiToplami(int sayi) {

        Scanner scan = new Scanner(System.in);
        System.out.println("kac sayi toplamak istiyorsunuz?");
        int sayiAdedi= scan.nextInt();


        if (sayiAdedi==2){
            System.out.println("ilk sayiyi girin");
            int x1=scan.nextInt();
            System.out.println("ikinci sayiyi girin");
            int x2=scan.nextInt();
            System.out.println(x1+x2);
        } else if(sayiAdedi==3){
            System.out.println("ilk sayiyi girin");
            int x1=scan.nextInt();
            System.out.println("ikinci sayiyi girin");
            int x2=scan.nextInt();
            System.out.println("ucuncu sayiyi girin");
            int x3=scan.nextInt();
            System.out.println(x1+x2+x3);
        } else if (sayiAdedi==4){
            System.out.println("ilk sayiyi girin");
            int x1=scan.nextInt();
            System.out.println("ikinci sayiyi girin");
            int x2=scan.nextInt();
            System.out.println("ucuncu sayiyi girin");
            int x3=scan.nextInt();
            System.out.println("dorduncu sayiyi girin");
            int x4=scan.nextInt();
            System.out.println(x1+x2+x3+x4);
        } else if (sayiAdedi>4){
            System.out.println("Cok sayi girdiniz, ben toplayamam");
        } else {
            System.out.println("sayi adedi ikiden kucuk");
        }

        return sayi;

    }
}