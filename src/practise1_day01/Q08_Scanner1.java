package practise1_day01;

import java.util.Scanner;

public class Q08_Scanner1 {
    public static void main(String[] args) {

        //kullanicidan 2 tamsayi alin
        //toplayin sonucu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen tamsayi giriniz:");
        int t = scanner.nextInt();
        System.out.print("lutfen bir tamsayi giriniz:");
        int t1 = scanner.nextInt();
        int toplam = t + t1;
        System.out.print("toplam:" + toplam);
    }
}
