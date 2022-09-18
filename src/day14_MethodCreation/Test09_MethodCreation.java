package day14_MethodCreation;

import java.util.Scanner;

public class Test09_MethodCreation {
    public static void main(String[] args) {
         /*
        Kullanicidan ismini,soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin
        isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
        KK numarasini ise 4 rakamlik 4 blok olacak sekilde duzelten 2 method yazin,ve programda kullanabilmek
        icin duzenlenmis hallerini geri dondurun
         */

        String str1 = isim();
        String sayi=kartNo();


        System.out.println("isim: "+str1);
        System.out.println("KartNo: "+sayi);

    }

    public static String kartNo() {

        Scanner scan = new Scanner(System.in);
        System.out.println("16 haneli kk no giriniz");
        String kk = scan.nextLine();
        kk=kk.substring(0,4)+" "+kk.substring(4,8)+" "+kk.substring(8,12)+" "+kk.substring(12,16);


        return kk;
    }

    public static String isim() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();


        return (isim+" "+soyisim);
    }

}
