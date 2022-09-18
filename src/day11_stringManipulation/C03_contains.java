package day11_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        //mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa
        //“Email adresiniz kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

         Scanner scan=new Scanner(System.in);
        System.out.println("lutfen email yazınız");
        String email=scan.nextLine();

        if (!email.contains("@gmail")) {
            System.out.println("gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com") ==(email.length()-10)) {
            System.out.println("gmail adresiniz kaydedildi");

        }else {
            System.out.println("gecersiz");
        }

    }
}
