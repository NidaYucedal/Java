package day25_constructor;

public class Car {

    /*
    BU Class bizim kalip hanemiz
    bir araba olusturmak icin ihtiyacimiz olan variable ve methodlari bu classta belirleriz

    sonra farkli class lardan araba olusturmamiz gerekirse
    bu classlardan bir obje olusturup
    burada belirlenen variable ve methodlara gore araba uretiriz
     */

    public String marka = "Marka belirtilmedi.";
    public String model = "Model belirtilmedi.";
    public int yil;
    public int fiyat;

    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahiptir.");
    }

    public void maxhiz(int hiz) {

        System.out.println("Bu araba max" + hiz + "km hiz yapar.");

    }

}
