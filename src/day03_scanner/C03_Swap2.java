package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 += sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println(" sayi1:" + sayi1 + " sayi2:" + sayi2);

        int s1 = 10;
        int s2 = 20;
        s1 = s1 + s2;
        s2 = s1 - s2;
        s1 = s1 - s2;
        System.out.println("swaptan sonra sayi1:" + s1);
        System.out.println("swaptan sonra sayi2:" + s2);


    }
}
