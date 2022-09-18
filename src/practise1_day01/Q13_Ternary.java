package practise1_day01;

import java.util.Scanner;

public class Q13_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir fiyat giriniz");
        int sayi= scanner.nextInt();

        System.out.println(sayi<10 ? "ucuz" : sayi>=10 && sayi<=19 ? "normal" : "pahalı");


    }
}
