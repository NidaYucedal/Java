package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variablena ulasabildim degistirebildim(set) ve yazdirdik(get)

        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //access modifier kullnarak mark avariablena ulasimi tamamen serbest yapabilir
        //veya tamamamen engelliyebilirm
        //private yaptıgimiz modele ise hic ulasamayiz
        //yani access modifier ya hep ya hic diyor


        //modeli degisitirelim ama goremeyelim
        //yakitida gorelim ama degistiremeyelim

        //set ve get yetkilerini ozel olarak tanimlamak isterseniz
        //1. adim-ozel yetki taminlayacagimiz variablelari private yapin
        //private bir dataya baska classlardan ulasmak mumkun olamadigindan
        //2. adim-set yetkisi icin setter,ve get yetkisi icin getter methodlari olusturalim


        arb1.setModel("Corolla"); //model olarak corollayi atadik
        //modeli yazdirma imkanimiz yok (getter yok)
        System.out.println(arb1.getYakit()); //elektrikli bilgisini yazdiridk
        //yakiti degistiremeyiz cunku setter methodu yok




    }
}
