package day20_scopeArrays;

public class C03_Length {
    public static void main(String[] args) {

        //iki sekilde array olusturabliriz

        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayilar array'in uzunlugu : "+sayilar.length);
        //string lenght methodunda parantez var ama Array de yok

        System.out.println("harfler array'in uzunlugu : "+harfler.length);

        //harfler arrayının son elementini yazdırın

        System.out.println(sayilar[sayilar.length-1]);
    }
}
