package day17_nestedForLoop;

import java.util.Scanner;

public class Test05_WhileLoop {
    public static void main(String[] args) {

        // Soru 7 ) Kullanicidan bir sayi alin
        //          ve bu sayinin rakamlari toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();

        int rakamlarToplami=0;
        int rakam=0;


        while (sayi>0){

            rakam=sayi%10;
            rakamlarToplami+=rakam;
            sayi/=10;

        }
        System.out.println("sayinin rakamlar Toplami ="+rakamlarToplami);
        scan.close();
    }
}
