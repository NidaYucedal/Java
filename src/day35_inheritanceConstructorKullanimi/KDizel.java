package day35_inheritanceConstructorKullanimi;

public class KDizel extends HCorolla{

    public KDizel() {
        System.out.println("paraetresiz cons");

    }

    public KDizel(String isim) {

        super(isim);
        System.out.println("k parametreli");
    }

    public static void main(String[] args) {

        KDizel obj1=new KDizel("hasan");

    }
}
