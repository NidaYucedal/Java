package day37_overriding;

public class EToyota extends DAraba{

    @Override
    void marka() {
        /*
        super.marka(); eger hem overridden hem de overriding methodu calismasini istersek
        ilk satira super.marka(); yazabiliriz.
         */
    }

    void motor(){
      System.out.println("Toyota araclar Toyata marka motor kullanir");
  }

}
