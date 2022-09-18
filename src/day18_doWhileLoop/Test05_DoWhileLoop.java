package day18_doWhileLoop;

import java.util.Scanner;

public class Test05_DoWhileLoop {
    public static void main(String[] args) {

        /*
soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin,
islemi bitirmek icin 0’a basmasini soyleyin.

 Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini
 ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin

 */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozitifSayi=0;
        int pozToplam=0;



        do {

            System.out.println("pozitif sayi giriniz:");
            sayi=scan.nextInt();

            if (sayi>0){
                pozToplam+=sayi;
                pozitifSayi++;
            }

        }while (sayi!=0);


        System.out.println(pozitifSayi + " girdiginiz pozitif sayilar toplami: "+pozToplam);
    }
}
