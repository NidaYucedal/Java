package day37_overriding;

public class C01_Overloading {
    public static void main(String[] args) {

        /*
        bir class'da ayni isimde ve ayni signature sahip
        iki method olmaz. Ayni class'da ayni isimde birden fazla method
        istersek mutlaka signature'i (parametre) degistirmeliyiz

        Farkli class'larda ayni isim ve signatureye sahip iki
        method olabilir mi? -Evet olabilri

         */

    }
    void ekleme(){

    }

    void ekleme(int sayi){

    }
    void ekleme(String str){

    }
    void ekleme(String str,int sayi){

    }
    void ekleme(int sayi,String str){

    }
}

