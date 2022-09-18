package day35_inheritanceConstructorKullanimi;

public class EMuhasebe extends DPersonel{

    EMuhasebe() {
        System.out.println("emuhasebe parametresiz cons");
    }
    EMuhasebe(String isim) {
        System.out.println("emuhasebe parametreli cons");
    }


}
