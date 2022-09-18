package lambda_practise;

import lambda_functional_programming01.Utils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        System.out.println(toplaAmeleFunc());
        //System.out.println(toplaAmele());
        System.out.println(toplaCift());
        System.out.println(toplaIlkXCift(1, 10));
        System.out.println(toplaIlkXTek(1, 10));
        ikininIlkXKuvvetPrint(2, 5);
        isteneSayiIlkXKuvvetPrint(3, 6);
        System.out.println(istenenSayiFactorial(5));
        System.out.println(xKuvveti(6,3));
        arrayYazdir();




    }

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar
    // tamsayilari toplayan bir program create ediniz.
    //Structured(AMELE) Programming

    // public static int toplaAmele() {

        /*Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");

        int sayi = reader.nextInt();
        int toplam = 0;

        for(int i = 1; i <= sayi; ++i) {
            toplam += i;
        }

        System.out.println("Sayıların Toplamı = " + toplam);


        return sayi;

         */

    public static int toplaAmeleFunc() {

        return IntStream.range(1, 100).reduce(Math::addExact).getAsInt();
    }


    //TODO TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplaCift() {

        return IntStream.range(1, 100).filter(Utils::ciftElemanSec).sum();
    }

    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaIlkXCift(int x, int y) {

        int z = 0;
        if (x > y) {
            z = x;
            x = y;
            y = z;
        }

        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemanSec).sum();
    }

    //TODO TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int toplaIlkXTek(int x, int y) {

        int z = 0;
        if (x > y) {
            z = x;
            x = y;
            y = z;
        }
        return IntStream.rangeClosed(x, y).filter(Utils::tekElemanSec).sum();
    }

    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi create ediniz.
    public static void ikininIlkXKuvvetPrint(int x, int y) {


        x = 2;
        y = 5;

        System.out.println(Math.pow(x, y));

    }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void isteneSayiIlkXKuvvetPrint(int istenenSayi, int x) {

        istenenSayi = 3;
        x = 6;

        System.out.println(Math.pow(istenenSayi, x));
    }

    // TODO TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static int istenenSayiFactorial(int x) {

        if (x >= 0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0 da buyuk giriniz");
        return 0;
    }

    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static double xKuvveti(int sayi, int x) {

        sayi=6;
        x=3;

        return Math.pow(sayi,x);
    }

    public static void arrayYazdir(){

          /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm
elemanları bir listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
*/
        String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};

        Arrays.stream(arr).flatMap(Arrays::stream).sorted().forEach(Utils::ayniSatirdaBosluklaYazdir);

    }




}

