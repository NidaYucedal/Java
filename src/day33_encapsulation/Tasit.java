package day33_encapsulation;

public class Tasit {

   private String tasitTuru;
   private boolean muayenesiVarMi;
   private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    //getter methoduda tek bir satirlik islem yapiyor
    //baska classlarin private oldugu icin erisemedigi
    //tasitturu bilgisini,class icinden alip
    //istenen farkli classlardan return ediyor

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;

        /*
    return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    burada bir satırlık islem yapıyor
    o bir satırlık islemde bizim gönderdiğimiz parametreyi instance variable a atıyor.
         */
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    // boolean variabe'ler icin olusturulan methodlarinin ismi
    // isVariableIsmi seklinde olur



    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

}
