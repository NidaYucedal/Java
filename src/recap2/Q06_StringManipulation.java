package recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("string1 :");
        String str1 = scan.nextLine();
        System.out.println("string2 :");
        String str2 = scan.nextLine();

        System.out.println("1.yontem :" + str1 + " " + str2);
        System.out.println("2.yontem :" + str1.concat(" " + str2));

        String str1_0indextenSonrasi = str1.substring(1);
        String str2_0indextenSonrasi = str2.substring(1);

        System.out.println("manipulationdan sonraki hali :" + str1_0indextenSonrasi + "" + str2_0indextenSonrasi);
    }
}