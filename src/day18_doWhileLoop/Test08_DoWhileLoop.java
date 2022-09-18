package day18_doWhileLoop;

import java.util.Scanner;

public class Test08_DoWhileLoop {
    public static void main(String[] args) {

        /*
      kullanicidan toplamak icin sayi isteyin ve toplam 500 e ulasincaya kadar
      devam etmeyi isteyin.
      toplam 500 e ulastiginda veya gectiginde toplami ve kac sayi girdigini yazdirin

       */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayac=0;

        do {

            System.out.println("toplamak icin sayi giriniz:");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;

        }while(toplam<=500);

        System.out.println(sayac+ " adet girdiginiz sayilar toplmai: "+toplam);

    }
}
