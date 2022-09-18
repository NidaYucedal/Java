package day07_IfStatement;

import java.util.Scanner;

public class Test04_Ucgen {

    public static void main(String[] args) {

           /*
        Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
                birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
                “Eskenar degil” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("ucgenin bir kenar uzunlugunu giriniz");
        double a=scan.nextDouble();

        System.out.println("2. kenar uzunlugunu giriniz");
        double b=scan.nextDouble();
        System.out.println("3. kenar uzunlugunu giriniz");
        double c=scan.nextDouble();

        if (a==b || c==a ||b==c) {
            System.out.println("Eskenar ucgen");
        } else{
            System.out.println("eskenar degil"); }
    }
}


