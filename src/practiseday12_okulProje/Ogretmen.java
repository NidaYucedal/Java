package practiseday12_okulProje;

public class Ogretmen extends Kisi{

    private String bolum;
    private int sicilNo;

    public Ogretmen(){

    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, int sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }


    @Override
    public String toString() {
        return
                "\nbolum : " + bolum +
                "\nsicilNo : " + sicilNo+ super.toString();
    }


}
