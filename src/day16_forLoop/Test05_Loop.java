package day16_forLoop;

import java.util.Scanner;

public class Test05_Loop {
    public static void main(String[] args) {

        //kullanicidan pozitif bir rakam girmesini isteyin
        //ve girilen rakama gore carpım taplosu olusturun
        //orn kullanici 3 girerse 3 6 9


        Scanner scan=new Scanner(System.in);
        System.out.print("pozitif bir rakam giriniz:");
        int sayi= scan.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(sayi+" * "+i+" = "+sayi*i);

        }


        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}


