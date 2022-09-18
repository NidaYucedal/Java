package lambda_functional_programming01;

import java.net.PortUnreachableException;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Fp03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Alı");
        liste.add("Alı");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfleYazdir(liste);
        System.out.println();
        //buyukHarfleYazdir2(liste);
        uzunlugaGoreYzadir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreSirala(liste);
        System.out.println();
        uzunlugaVeIlkKaraktereGoreYazdir(liste);


    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.

    public static void buyukHarfleYazdir(List<String> liste) {

        liste.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //2.yol

    // public static void buyukHarfleYazdir2(List<String>liste){

    // liste.replaceAll(String::toUpperCase);
    // System.out.println(liste);

    //}

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreYzadir(List<String> liste) {

        liste.stream().sorted(Comparator.comparing(String::length)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
//3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreTersYazdir(List<String> liste) {

        liste.stream().sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKaraktereGoreSirala(List<String> liste) {

        liste.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaVeIlkKaraktereGoreYazdir(List<String> liste) {

        liste.stream().distinct().sorted(Comparator.comparing(String::length).
                        thenComparing(Utils::ilkKarakterAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

//6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
//    public static void bestenBuyukleriSil(List<String> list){
//
//        list.removeIf(t->t.length()>5);                           ==> list, mutable olduğu için elemanları işlem sonrası kalıcı değiştiğinden comment-out yapıyorum.
//        System.out.println(list);
//
//    }

        //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
        //1. Yol
//    public static void baslangiciAYadaSonuNOlaniSil(List<String> list){
//
//        list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
//        System.out.println(list);
//
//    }
        //2. Yol
//    public static void baslangiciAYadaSonuNOlaniSil02(List<String > list){
//
//        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
//        System.out.println(list);//[Mark, Christopher, Mariano, Tucker]
//
//    }
        //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
//    public static void uzunlugu8ile10arasiveOIleBiteniSil(List<String > list){
//
//        list.removeIf(t->(t.length()>7 && t.length()<11) || t.endsWith("o"));
//        System.out.println(list);
//
//    }

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean uzunlugu12denAzMi(List<String> list){

        return list.stream().allMatch(t->t.length()<12);
    }

        //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xIleBaslamiyorMu(List<String> list){

        return  list.stream().noneMatch(t->t.startsWith("X") || t.startsWith("x"));
    }

    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitenVarMi(List<String> list){

        return list.stream().anyMatch(t->t.endsWith("r"));
    }

}


