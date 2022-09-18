package day35_inheritanceConstructorKullanimi;

public class HCorolla extends GToyota{

    HCorolla() {
        System.out.println("h parametresiz");
    }


    HCorolla(String isim) {
       super(isim);
        System.out.println("h parametreli");
    }
}
