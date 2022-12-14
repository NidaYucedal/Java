package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fp02 {
    public static void main(String[] args) {

        /*
       1) t-> "Logic" , (t, u) -> "Logic"
        Bu yapiya "Lambda Expression"

       2) Functional Programming kapsaminda "Lambda Expression" kullanilabilir ama onerilmez.
       Lambda Expression yerine "Method Reference" tercih edilir.

       3) "Method Reference" kullanimi "Class name :: Method Name"


       Ayni zamanda kendi class'larimizi da kullanabiliriz.
       Ornegin : Bir Animal class var ve bu class "eat()" methoduna sahip -> "Animal :: eat"

         */

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        System.out.println(list);

        listElemanYazdirFunctional(list);
        System.out.println();
        ciftElemanYazdirFunctional(list);
        System.out.println();
        tekElemanKareleri(list);
        System.out.println();
        tekElemanKupleriYazdir(list);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(list);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami2(list);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami3(list);
        System.out.println();
        tekrarsizCiftElemanlarinKupleriCarpimi(list);
        System.out.println();
        getMaxEleman(list);
        System.out.println();
        enKucuk(list);
        System.out.println();
        yedidenBuyukCiftMin(list);
        System.out.println();
        tersSiralamaTekrarsizElemmanlarinYarisi(list);
    }

    //1) Ardışık list elemanlarını aynı
    //satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)

    public static void listElemanYazdirFunctional(List<Integer> list) {


        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //2)Ardışık çift list elementlerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanYazdirFunctional(List<Integer> list) {

        list.stream().filter(Utils::ciftElemanSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanKareleri(List<Integer> list) {

        list.stream().filter(Utils::tekElemanSec).map(Utils::kareAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElemanKupleriYazdir(List<Integer> list) {

        list.stream().distinct().filter(Utils::tekElemanSec).map(Utils::kupunuAl).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }


    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {

        list.stream().distinct().filter(Utils::ciftElemanSec).
                map(Utils::kareAl).reduce(Math::addExact); //toplam yaptı

    }
    //2.yol

    public static void tekrarsizCiftElemanlarinKareToplami2(List<Integer> list) {

        Integer toplam = list.stream().distinct().
                filter(Utils::ciftElemanSec).
                map(Utils::kareAl).
                reduce(Math::addExact).get();
        System.out.print(toplam);

    }

    //3.yol

    public static void tekrarsizCiftElemanlarinKareToplami3(List<Integer> list) {

        Integer toplam = list.stream().distinct().
                filter(Utils::ciftElemanSec).
                map(Utils::kareAl).
                reduce(0, Integer::sum);
        System.out.print(toplam);


    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKupleriCarpimi(List<Integer> list) {

        Integer carpim = list.stream().distinct().filter(Utils::ciftElemanSec).
                map(Utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.print(carpim);

    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list) {

        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.print(max);

    }
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

    public static void enKucuk(List<Integer> list) {

        Integer kucuk = list.stream().distinct().reduce(Math::min).get();
        System.out.print(kucuk);
    }


    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMin(List<Integer> list) {

        Integer min = list.stream().distinct().filter(t -> t > 7).
                filter(Utils::ciftElemanSec).reduce(Math::min).get();
        System.out.print(min);
    }

//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların
// yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaTekrarsizElemmanlarinYarisi(List<Integer> list) {

        List<Double> sonuc = list.
                stream().distinct().
                filter(t -> t > 5).
                map(Utils::yarisiniAl).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.print(sonuc);

    }



}