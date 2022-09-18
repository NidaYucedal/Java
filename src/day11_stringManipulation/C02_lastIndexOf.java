package day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="java cok kolay, java cok guzel";
        String kelime="cok";

        // verilen kelime ıcın asagıdaki sartlardan uygun olanı yazan bir program yazınız
        // verilen kelime cumlede kullanılmamıs
        // verilen kelime cumlede sadece bir kere kullanılmıs
        // verilen kelime cumlede birden fazla kullanılmıs



        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1) {
            System.out.println("verilen kelime cumlede kullanılmamıs");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadcece 1 kere kullanılmıs");

        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanılmıs");

        }
    }
}
