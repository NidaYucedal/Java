package day07_IfStatement;

import java.util.Scanner;

public class Test02_GunIsimleri {
    public static void main(String[] args) {

         /*
        Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
                isimlerini yazdirin
                Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
                ilkHarf=S output = “Sali”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Luften gun isimlerinden birinin ilk harfini giriniz");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf=='p' || ilkHarf=='P'){
            System.out.println("P harfi ile baslayan gunler : Pazartesi, Persembe, Pazar");
        }
        else if (ilkHarf=='s' || ilkHarf=='S'){
            System.out.println("S harfi ile baslayan gunler : Sali");
        }
        else if (ilkHarf=='c' || ilkHarf=='C'){
            System.out.println("C harfi ile baslayan gunler : Carsamba, Cuma, Cumartesi");
        }
        else {
            System.out.println("gecerli bir harf giriniz");
        }


    }


}

