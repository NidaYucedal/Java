package practise6_day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {
    public static void main(String[] args) {



        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */


        List<String> isimler = new ArrayList<>();
        isimler.add("enes");
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("oguz");
        isimler.add("nida");
        isimler.add("sena");
        System.out.println(isimler);

        Scanner scan = new Scanner(System.in);
        System.out.println("kullanmak istediginiz ismi giriniz:");
        String isim = scan.nextLine().trim();

        boolean isimVarMi = isimler.contains(isim);

        if (isimVarMi) {
            System.out.println("isim zaten var");
        } else System.out.println("bu kullanici adini kullanabilirsiniz.");

        if (isimVarMi) {
            int randomsayi = new Random().nextInt(100);
            isim = isim + "" + randomsayi;
            System.out.println("yeni kullanici adınız " + isim);
            isimler.add(isim);
            System.out.println("isimler " + isimler);
        } else System.out.println("yeni kullanici adınız " + isim);


    }
}
