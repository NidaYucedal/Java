package day12_stringManipulation;

public class C03_substring {
    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartno = "123 456 755658";

        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring(soyisim.length() - 3));
        System.out.println(isim.substring(2, 4));

        //isim ve soyismin ilk harfi buyuk geriye kalan yıldız
        // kartın ilk dört rakamı goronsun gerisi yıldız

        String isimIlkHarf = isim.substring(0, 1).toUpperCase();
        String isimgeriyekalan = isim.substring(1).replaceAll("\\w", "*");

        String soyIsimIlkharf=soyisim.substring(0,1).toUpperCase();
        String soyIsimgeriyekalan=soyisim.substring(1).replaceAll("\\w", "*");

        String kredikart = kartno.substring(0, 4);
        String kredikartGeriyeKalan = "**** **** ****";

        System.out.println(isimIlkHarf + isimgeriyekalan
                + " " + soyIsimIlkharf + soyIsimgeriyekalan
                + "\n" + kredikart + kredikartGeriyeKalan);



    }
}
