package day18_doWhileLoop;

import java.util.Scanner;

public class Test06_DoWhileLoop {
    public static void main(String[] args) {

         /*
    Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
    islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
    ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve
    girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayilarToplami=0;

        do {

            System.out.println("pozitif bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi>0){

                pozSayilarToplami+=sayi;
                pozSayiAdedi++;

            } else if (sayi<0) {

                negSayiAdedi++;
                System.out.println("negatif sayi giremezsiniz");

            }

        }while (sayi!=0);

        System.out.println(pozSayiAdedi+" adet pozitif sayi girdiniz.Toplamlari: "+pozSayilarToplami);
        System.out.println(negSayiAdedi+" adet negatif sayi girdiniz fakat toplama eklenmedi");


    }
}