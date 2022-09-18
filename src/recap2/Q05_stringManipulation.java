package recap2;

import java.util.Scanner;

public class Q05_stringManipulation {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz ");
        String isim=scan.next();
        System.out.println("soyisim giriniz ");
        String soyisim=scan.next();
        System.out.print(isim.toUpperCase());
        System.out.println(soyisim.toUpperCase());



    }
}
