package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /* wrapper class javanin hazir methodlari kullanabilmemiz icin primitive data türlerinin
        herbiri icin actigi classlardır.

        int Integer
        char Character
        digerleri primitive data türü ile ayni sadece başharf büyük
         */

        String str = "Java ile hayat guzel";
        System.out.println(str.toUpperCase());

        boolean guzelMİ = true;
        // boolen primitive oldugundan hazır methodu bulunmuyor

        Boolean buguzelMi = true;
        buguzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrNo = "054356";
        // kullanıcıdan bir sifre isteyin
        // eger sifre rakamlardan olusuyorsa kabul etmeyin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 5 basamakli bir sifre giriniz");
        String sifre = scan.nextLine();
        Integer sifreSayi = Integer.parseInt(sifre);



        System.out.println("girilen sifrenin 3 fazlasi:" + (sifre+3));
        System.out.println("integer sifrenin 3 fazlasi:"+ (sifreSayi+3));







    }
}
