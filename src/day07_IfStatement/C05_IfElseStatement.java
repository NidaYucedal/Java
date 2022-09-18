package day07_IfStatement;

import java.util.Scanner;

public class C05_IfElseStatement {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        if (a >= b) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b);
        }


        // Kullanicidan bir karakter girmesini isteyin ve
        // girilen karakterin harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char harf = scan.next().charAt(0);

        if ((harf >= 'a' && harf <= 'z')|| (harf >= 'A' && harf <= 'Z')){
            System.out.println("Girilen karakter bir harf");


        } else {
            System.out.println("Girilen karakter bir harf degil");

        }
        }
    }



