package day05_matematikselislemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str="Java Cok guzel";
        str.toUpperCase();

        int sayi=10;
        // primitive data turlerinin yaninda method olmaz
        // java bazi method lari kullanabilmemiz icin
        // her bir primitive data turu icin bir wrapper(sarmalayıcı) class olusturmustur

        Integer sayi2=10;

        sayi2.byteValue();
        int num1 = 12;

        int num2 = 15;

        num1*=2;

        num2/=3;

        System.out.println(num1 + num2);
    }
}
