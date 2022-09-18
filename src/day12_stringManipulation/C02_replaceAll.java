package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2gu3n ja*va- cok g3uz/el";

        // str bugun java cok guzel haline getirin
        // replaceall amacı aynı ozellikteki tum karakterleri kapsamasıdır
        //butun sayıları sil ve butun karakterleri sil
        //tum ozel karakterleri silelim dedigimizde spacelerde silinir
        // spaceleri korumak ıcın en basta onların yerine cumlede bulunmayacak bir string koyalim

        str=str.replace(" ", "qazwsx");
        System.out.println(str);
        str = str.replaceAll("\\W", "");
        System.out.println(str);
        str=str.replaceAll("\\d", "");
        str=str.replace("qazwsx", " ");
        System.out.println(str);

    }
}
