package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    public static void main(String[] args) {

        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz:");
        int sayi = scan.nextInt();

        int birlerBas = sayi % 10, onlarbas = (sayi / 10) % 10, yuzlerBas = sayi / 100;

        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBas) {
                case 0: System.out.println(" ");break;
                case 1: System.out.println("yuz\t");break;
                case 2: System.out.println("ikiyuz\t");break;
                case 3: System.out.println("ucyuz\t");break;
                case 4: System.out.println("dortyuz\t");break;
                case 5: System.out.println("besyuz\t");break;
                case 6: System.out.println("altıyuz\t");break;
                case 7: System.out.println("yediyuz\t");break;
                case 8: System.out.println("sekizyuz\t");break;
                case 9: System.out.println("dokuzyuz\t");break;

            }
            switch (onlarbas) {
                case 0: System.out.println(" ");break;
                case 1: System.out.println("on\t");break;
                case 2: System.out.println("yirmi\t");break;
                case 3: System.out.println("otuz\t");break;
                case 4: System.out.println("kirk\t");break;
                case 5: System.out.println("elli\t");break;
                case 6: System.out.println("altmıs\t");break;
                case 7: System.out.println("yetmis\t");break;
                case 8: System.out.println("seksen\t");break;
                case 9: System.out.println("doksan\t");break;

            } switch (birlerBas) {
                case 0: System.out.println(" ");break;
                case 1: System.out.println("bir");break;
                case 2: System.out.println("iki");break;
                case 3: System.out.println("uc");break;
                case 4: System.out.println("dort");break;
                case 5: System.out.println("bes");break;
                case 6: System.out.println("altı");break;
                case 7: System.out.println("yedi");break;
                case 8: System.out.println("sekiz");break;
                case 9: System.out.println("dokuz");break;

            }
        }else System.out.println("uc basamakli sayi giriniz");

        int sayi1 = 456;

        int birlerBasamagi = sayi1 % 10;
        int yuzlerBasamagi = (sayi1 - birlerBasamagi) /100;
        int onlarBasamagi = (sayi1 - ((yuzlerBasamagi*100)+(birlerBasamagi)))/10;

        System.out.println("yuzler basamagi : "+yuzlerBasamagi);
        System.out.println("onlar basamagi : "+onlarBasamagi);
        System.out.println("birler basamagi : "+birlerBasamagi);




    }
}
