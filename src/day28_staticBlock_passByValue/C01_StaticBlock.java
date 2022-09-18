package day28_staticBlock_passByValue;

public class C01_StaticBlock {

    static int sayi;

    static {
        /*
        Static block class uyelerinin tamamindan once calisir(main den once bile)
        static block class olusturuldugunda calisir
        genellikle class la ilgili on ayarlar veya static variable lara deger atamak icin kullanilir


        static bloclarib class icerisinde neredfe oldugu onemli degildir
        once satic blocklar calisir

        birden fazla static block varsa yukaridan asagi calisir

         */
        System.out.println("static blok calisti.");
        sayi=10;

    }

    public static void main(String[] args) {

        System.out.println("main method calisir.");
        System.out.println(sayi);//0
    }

    static {

        System.out.println("main method altindaki static block calisti");
    }

}
