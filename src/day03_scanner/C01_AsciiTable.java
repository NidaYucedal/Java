package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        int sayi=10;
        char harf='a'; // a=97 ascii
        String str="banan";

        System.out.println(sayi+harf);
        System.out.println(sayi*harf);
        System.out.println(str+harf);
        System.out.println(str+sayi+harf);
        System.out.println(str+harf+sayi);
        System.out.println(""+sayi+harf);//10a
        char deger='1';
        System.out.println(deger + harf); // 1+a 49+97=146



        /* char yeniHarf=harf+2; java once sagdaki islemi yapar burada ascii degerini alır sonuc 99 bu atama kabul
        edilebilir degildir */



        /* char data turu isleme girdigi degiskenin turune gore farklı davranabilir
        eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranır
           */
    }
}
