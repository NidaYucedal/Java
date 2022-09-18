package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        //bir onceki soruyu tek scanner ile yazdir//

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi ve yasinizi giriniz \naralarda enter basiniz");
        String isim=scan.nextLine();
        System.out.println();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("girilen bilgiler= "+isim+" "+soyisim+" "+yas );


    }
}
