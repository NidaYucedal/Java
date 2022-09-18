package day15_overloading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {

        topla(5, 7);
        topla(5.2,3);
        topla(3.4,6.1);
        topla(5,6.2);// iki double verdi

        /*
        java hangi methodun calisacagina karar verirken optimizasyon yapar
        -eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir
        -eger cast yapmadan kullanacagi bir method yoksa,en az cast yaparak kullanabilecegi
        methodu tercih eder
        
         */

    }


    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integer in toplami: " + (sayi1 + sayi2));

    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("Bir double ve integer in toplami: " + (sayi1 + sayi2));

    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki double in toplami: " + (sayi1 + sayi2));

    }
}
