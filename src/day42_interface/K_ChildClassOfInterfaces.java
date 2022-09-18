package day42_interface;

public class K_ChildClassOfInterfaces implements I02_ınterface,I03_Interface{


    /*
    bir class'i bir interface'e child yapmak icin implements keyword kullanilir
    implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz

    bir interface bir classi parent edinemez

     */

    public static void main(String[] args) {
        System.out.println(I03_Interface.SAYI);
        System.out.println(I02_ınterface.SAYI);
        System.out.println(ISIM);
    }
}
