package day02_variables;
import java.util.Scanner;

public class C03_Variables {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String kullaniciIsmi=scan.nextLine();
        System.out.println("Hoşgeldiniz : " + kullaniciIsmi);

    }
}
