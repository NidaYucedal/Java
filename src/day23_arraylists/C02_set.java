package day23_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        //elimizde urunlerin bulundugu bir liste var
        //listedeki istenen siradaki urunu yenisi ile degistirip
        //eski urunu var olan eski urunler listesine ekleyelim


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        List<String> eskiUrunler = new ArrayList<>();
        //listedeki ikramin yerine biskrem koyalim
        //ikramida eski urunler listesine ekleyelim

        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ikram";


        int temp = urunler.indexOf(silinecekUrun);
        String silinenUrun= urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);
        System.out.println("liste:"+urunler);
        System.out.println("eski urunler listesi:"+ eskiUrunler);



    }
}
