package practise1_day01;

import java.util.Scanner;

public class Q10_ıfStatement01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Y/N ikilisinden birisini giriz");
        char a = scan.next().charAt(0);

        if (a == 'Y' || a == 'y') {
            System.out.println("YES");
        } else if
        (a == 'N' || a == 'n') {
            System.out.println("NO");

        } else {
            System.out.println("gecrsiz");
        }


    }
}
