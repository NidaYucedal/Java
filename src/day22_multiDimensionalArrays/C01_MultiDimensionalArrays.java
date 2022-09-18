package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {

        //tek katli arraylerde arrayi direk yazdiramiyoruz
        //cunku array non primitive data turudur ve her non primitive,
        //data direk yazdirilamayabilir
        //ancak arrayin icindeki elementleri direk yazdirabiliyoruz
        //cunku genelde primitive data turu veya  string elementler kullaniliyordu

        //multi dimensional array lerde en dikkat edecegimiz konu ulasmak istedigimiz elementin
        //bir array mi yoksa primitive data mi oldugudur

        int[][] sayilar = {{1, 2, 4, 5}, {3, 4}};

        // burada sayilar arrayini dusunursek icinde 2 tane inner array var
        //sayilar[0] ==> {1,2,4,5}

        //ancak en icerdeki elementlere ulasirsak direk yazdirabiliriz

        System.out.println(Arrays.toString(sayilar[0])); //[1, 2, 4, 5]

        System.out.println(sayilar[0][1]);
        System.out.println(sayilar[1][0]);
        System.out.println(Arrays.deepToString(sayilar)); //tum arrayi yazdırmak icin

        //arrayi iki sekilde declare debikliyorduk
        //1- elemanlari direk yazabiliriz
        //2-outer ve inner arraylerin uzunluklarini belirterek olusturabilliriz
        //int[][]sayilar =new int[3][4];
        //ancak 2. yontemle yaptigimizda inner arraylerin farkli uzunlukta olma ihtimali kalmaz
        //her bir inner arrayin ise 4 er elemani vardir
        //eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz mecburen 1. yontem kullanilmali







    }
}
