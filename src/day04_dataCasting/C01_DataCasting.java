package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf = 'a';
        char yeniHarf = (char) (harf + 1); //char yeniHarf=97+1 =98 b nin ascii degeri 98
        System.out.println(yeniHarf);

        int sayi1 = (int) 7.3;

        double sayi2 = 10;
        System.out.println("sayi2:" + sayi2);

        int sayi3 = 'c';
        System.out.println("sayi3:" + sayi3);

        char harf2 = 98;
        System.out.println("harf2:" + harf2);

        


    }
}
