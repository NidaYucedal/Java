package recap1;

import java.util.Scanner;

public class Q04_notHesaplama {
    public static <toplam> void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("vize1 notunu giriniz");
        int vize1=scan.nextInt();
        System.out.println("vize2 notunu giriniz");
        int vize2=scan.nextInt();
        System.out.println("final notunu giriniz");
        int fnl=scan.nextInt();

        int vize=((vize1+vize2)*30/100 );
        int fnltoplam=(fnl*70/100);

        System.out.println(vize+fnltoplam);



    }
}
