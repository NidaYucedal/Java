package practise4_day05;

import java.util.Scanner;

public class Q04_MetCreationForLoop {
    public static void main(String[] args) {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String str = scan.nextLine();
        System.out.println(reverseString(str));

    }

    public static String reverseString(String str) {

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }

        return reverse;
    }
}
