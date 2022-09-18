package day05_matematikselislemler;

public class C02_Pre_PostIncrement {
    public static void main(String[] args) {
        int sayi=10;

        System.out.println("pre-increment:" + ++sayi); //artırma ve yazdırma islemi var artırma islemi once oldugu
          // ıcın once arttırır 11


        System.out.println("post-increment:" + sayi++); // once yazdırma sonra artırma sayidan sonra ++ oldugunda
        // artırma yazdırmadan sonra olur


        System.out.println("post-increment'den sonra:"+ sayi);

        sayi++;
        System.out.println(sayi);
        ++sayi;
        System.out.println(sayi);


    }
}
