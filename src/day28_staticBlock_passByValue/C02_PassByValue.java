package day28_staticBlock_passByValue;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        // Main method'dan diger method'lara veya diger method'lardan main method'a
		// bir variable gonderirseniz Java orjinal variable'lari degil
		// onlarin degerlerini(value) goturur, orjinal variable'in degeri degismez
         */


       double saticFiyati=100;

        System.out.println(indirimliFiyat(saticFiyati));//90.0

        System.out.println(saticFiyati);//100

        System.out.println(indirimliFiyat(saticFiyati));//90.0

        /*
        iki farkli methodta satisFiyati isminde variable olabliri
        java buna itiraz etmez cunku scope lari farklidir
         */

    }


    public static double indirimliFiyat(double orjinalFiyat) {
        //methodumuz %10 indirim yapip yeni fiyati main methoda dondursun

        double saticFiyati=orjinalFiyat*0.9;

        return saticFiyati;

    }


}
