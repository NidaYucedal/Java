package day27_staticKeyword;

public class C01 {


    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {

        /*
        class levelda iki tur variable olusturabiliriz
        static (class variable)
        instance (obje) varianle

        INSTANCCE OBJEDE BASLAR OBJEDE BITER STATICSE CLASDA BASLAR CLASDA BITER

        static variable lar tum class tan kullanilabilirken
        insteance olanlar static olmayan methodlar kullanilabilir
        instance variable lara static methoddan ulasmak istersek obje olusturmamız gerek


        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.
        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
        CLASSIN BASINDAN itibaren kod incelenmelidir.

         */

        C01 obj = new C01();
        System.out.println("obj1 in rakam degeri: " + obj.rakam); //5
        System.out.println("obj nin sayi degeri: " + sayi); //10

        obj.rakam += 1;
        sayi += 1;

        System.out.println("1 artırdıktan sonra obj in rakam degeri: " + obj.rakam); //6
        System.out.println("1 artirdiktan sonra obj nin sayi degeri: " + sayi); //11

        C01 obj2 = new C01();


        System.out.println("obj2 in rakam degeri: " + obj2.rakam); //5
        System.out.println("obj2 nin sayi degeri: " + obj2.sayi); //11

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("1 artidiktan sonra obj2 in rakam degeri: " + obj2.rakam); //6
        System.out.println("1 artirdiktan sonra obj2 nin sayi degeri: " + obj2.sayi); //12


    }

}
