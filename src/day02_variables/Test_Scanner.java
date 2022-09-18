package day02_variables;
import java.util.Scanner;

public class Test_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("yasınızı giriniz");
        String yas= scan.nextLine();
        System.out.println("iyi yaslar:"+ yas);



        System.out.println("2 öğrencinin adını giriniz");
        String isim1=scan.nextLine();
        String isim2=scan.nextLine();
        System.out.println(isim1+isim2);


        System.out.println("adınızı giriniz");
        String ad= scan.nextLine();
        String soyad= scan.nextLine();
        System.out.println("soyad g2iriniz");
        String soy= scan.nextLine();







    }
}
