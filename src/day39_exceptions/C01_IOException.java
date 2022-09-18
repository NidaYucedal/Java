package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        java da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream class'indan yardim aliriz.
        ayni sekilde Java'dan bilgisayarimzdaki bir dosyaya
        ekleme veya update yapmak istersek FileOutputStream class
        yardim aliriz.
         */


        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        goruldugu gibi compile time'da altini kirmizi cizen her durum
        Compile Time Error degildir.
        Java'da bazi exceptions da Compile Time Exception'dir.
        ozellikle dosya okuma ve yazma ile ilgili exceptio'lar
        Compile Time Exception'dir.


        Compile Time Exception olustugunda Java cozom icin iki ihtimal onerir
        1-try-catch ile cevrelemek
        2-methos signature'ina throws keyword ile beklenen exception turunu yazmak,

        throws exception, sadece olayin farkinda oldugumuzun deklarasyonudur.
        exception'nin handle edilmesinde hicbir rolu yoktur
        yani try-catch ile kontrol altina aldigimiz exception'larda kod calismaya devam ediyordu

        ancak throws exception yazdigimizda java bir exception ile karsilasirsa
        hicbir sey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur

         */

    }

}
