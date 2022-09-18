package day26_constructor;

public class Student {
    public String isim = "Isim belirtilmedi";
    public String soyisim = "Soyisim belirtilmedi";
    public String dogum = "Dogum belirtilmedi";
    public String ogrencino = "Ogrencino belirtilmedi";


    public Student() {

    }

    public Student(String isim, String soyisim, String dogum, String ogrencino) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogum = dogum;
        this.ogrencino = ogrencino;
    }

    public Student(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    @Override
    public String toString() {
        return
                         "\nisim=" + isim +
                        "\nsoyisim=" + soyisim +
                        "\ndogum=" + dogum +
                        "\nogrencino=" + ogrencino;
    }
}