package day08_ifStatement;

import java.util.Scanner;

public class Test01_Gecerli {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter password");

        String password = scan.nextLine();

        char initial = password.charAt(0);



        if(initial>='A' && initial<='Z') {

            if(initial=='A') {

                System.out.println("Gecerli");

            }else {

                System.out.println("Gecersiz");

            }

        }else if(initial>='a' && initial<='z') {

            if(initial=='z') {

                System.out.println("Gecerli");

            }else {

                System.out.println("Gecersiz");

            }

        }else {

            System.out.println("Yanlis input");

        }
    }
}
