package day15_overloading_forLoop;

public class Test01_10KereYazdırma {
    public static void main(String[] args) {

        // ekrana 10 kez java guzeldir yazdırın

        String str="java guzeldir";
        onKezYazdir(str);
    }

    public static void onKezYazdir(String str) {
        for (int i= 1; i < 10; i++) {
            System.out.println(str);
        }
    }
    }

