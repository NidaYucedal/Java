package practise5_day06;

import java.util.Scanner;

public class Q11_Odev {
    public static void main(String[] args) {


        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.


        String pin = "mehmet.1234";
        int girisHakki = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("********HOSGELDINIZ*********");
        while (true) {
            System.out.println("pin kodunuzu giriniz :");
            String girilenPin = scanner.nextLine();
            if (pin.equals(girilenPin)) {
                System.out.println("basarili giris yaptiniz..");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz..");
                girisHakki--;
                System.out.println("kalan giris hakkiniz :" + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi..bloklandiniz..");
                break;
            }
        }
    }
}







