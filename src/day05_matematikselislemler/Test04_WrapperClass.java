package day05_matematikselislemler;

public class Test04_WrapperClass {
    public static void main(String[] args) {
        short sayi=10;
        Short sayi1=30;

        sayi=sayi1;
        System.out.println(sayi);
        System.out.println(sayi1.intValue());
        System.out.println(Short.MAX_VALUE); //shortun en fazla ve en az degerini verir
        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Short.BYTES); //16 bit=2 byte



    }
}
