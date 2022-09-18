package day11_stringManipulation;

public class C04_contains {
    public static void main(String[] args) {


        //Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        //“kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, i
        //ki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

        String cumle = "java buyuk,dunya kucuk";

        if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("karar verr");
        } else {
            System.out.println("icermiyor");
        }
    }
}
