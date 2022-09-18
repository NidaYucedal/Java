package lambda_functional_programming01;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {

        /*
        1) lambda(functional programming) java 8 ile kullanilmaya baslanmistir
        2) functional programming de "ne yapilacak" (what to do) üzerine yogunlasir.
        Structured programming "nasil yapilacak" uzerine yogunlaşır.(how to do)
        3) Functional programming arrays ve collections ile kullanilir
        4) "entrySet() methodu ile Map,Set e donusturulerek functional programming da kullanilir


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
        listElemanlariniYazdirStructured(list);
        listElemanlariniYazdirFunctional(list);
        System.out.println();
        ciftElemanlariYazdirStructured(list);
        System.out.println();
        ciftElemanlariYazdirFunctional(list);
        System.out.println();
        tekelemanlarinKareleriniYazdir(list);
        System.out.println();
        tekrarsizTekElamanlarinKupunuYazdir(list);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(list);
        System.out.println();
        tekrarsizCiftElemanlarininKupununCarpimi(list);
        System.out.println();
        getMaxEleman(list);
        System.out.println();
        getMax(list);
        System.out.println();
        getYediBuyukCiftMin(list);
        System.out.println();
        getMin(list);
        System.out.println();
        getYediBuyukCiftMin2(list);
        System.out.println();
        getYediBuyukCiftMin3(list);
        System.out.println();
        getTersTekrarsizBestenBuyuk(list);


        //1) Ardışık list elementlerini aynı satırda aralarında boşluk
        // bırakarak yazdıran bir method oluşturun.(Structured)


    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {

        for (int w : list) {

            System.out.print(w + " ");

        }


    }

    //1)Ardışık list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        System.out.println();
        list.stream().forEach(t -> System.out.print(t + " "));
        //stream methodu collection dan elementleri akışa dahil almak icin ve methodlara ulasmak icn kullanilabilir


    }
    ////2)Ardışık çift list elemanlarini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list) {

        for (int w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }


    }

    ////2)Ardışık çift list elemanlarini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)


    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekelemanlarinKareleriniYazdir(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 1).map(t -> t * t).forEach(t -> System.out.print(t + " "));

    }

    //4) Ardışık tek list elementlerinin küplerini
    // tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElamanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 == 1).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {

        Integer toplam = list.stream().distinct().
                filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.print(toplam);

    }

    public static void tekrarsizCiftElemanlarininKupununCarpimi(List<Integer> list) {

        Integer carpim = list.stream().distinct().
                filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.print(carpim);
    }

    //list elemanlari arasindan en buyuk degeri bulan bir method

    public static void getMaxEleman(List<Integer> list) {

        Integer max = list.stream().distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u); //ternary kullanarak
        System.out.print(max);
    }

    //2.yol
    public static void getMax(List<Integer> list) {

        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.print(max);
    }

    //odev list elemanlari arasından en kucuk degeri bulan method 2.  yol

    public static void getMin(List<Integer> list) {
        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.print(min);
    }

    //list elemanlari arasından 7 den buyuk cift en kucuk degeri bulan method

    public static void getYediBuyukCiftMin(List<Integer> list) {

        Integer min = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.print(min);

    }

    //2.yol
    public static void getYediBuyukCiftMin2(List<Integer> list) {

        Integer min2 = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).
                sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.print(min2);
        //class ismiyle cagırdıgımızda static olur(Comparator class'ından reverseOrder cagırdık)

    }

    //3.yol
    public static void getYediBuyukCiftMin3(List<Integer> list) {

        Integer min3 = list.stream().filter(t -> t % 2 == 0).filter(t -> t > 7).sorted().findFirst().get();

        System.out.print(min3);

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı
    // değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersTekrarsizBestenBuyuk(List<Integer> list) {

     List<Double>sonuc= list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sonuc);

    }
}
