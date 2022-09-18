package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class   C02_ArraydenListOlusturma {
    public static void main(String[] args) {

        //icinde 200 tane 1000 den kucuk pozitif tam sayi olan bir lşst olusturun
        //kullanicidanbir sayi isteyip listede var olup olmadıgını yazdirin


        Random rnd = new Random();
        int sayi = 0;

        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {

            sayi = rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);

            }

        }
        System.out.print(sayiListesi + " ");

        boolean bildiMi = false;
        int tahminsayisi = 1;
        Scanner scan = new Scanner(System.in);

        while (!bildiMi) {

            System.out.println("lutfen bir sayi tahmininde bulunun:");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {

                System.out.println("Tebrikler " + tahminsayisi + "adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;
            }else {
                System.out.println(tahminsayisi+"adet sayi söylediniz ama hibiri listede yok");
                tahminsayisi++;
            }


        }


    }
}
