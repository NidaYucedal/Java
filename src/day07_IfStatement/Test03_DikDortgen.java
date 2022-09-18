package day07_IfStatement;

import java.util.Scanner;

public class Test03_DikDortgen {
    public static void main(String[] args) {

           /*
        Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
                olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kısa kenarını giriniz");
        double a=scan.nextDouble();

        System.out.println("lutfen dikdortgenin uzun kenarini giriniz");
        double b= scan.nextDouble();


        if (a>b || b>a){
            System.out.println("dikdortgendir");

        } else {
            System.out.println("karedir");}

    }
}
