package day12_stringManipulation;

public class Test06_kartIsim {
    public static void main(String[] args) {
        // isim,soyisim,kredi kartı no

        String str1="Nida";
        String str2="Yucedal";
        String str3="1234 5678 9045 6547"; // 19

        String IlkHarf = str1.substring(0, 1).toUpperCase();
        String isimgeriyekalan = str1.substring(1).replaceAll("\\w", "*");

        String soyIsimIlkharf=str2.substring(0,1).toUpperCase();
        String soyIsimgeriyekalan=str2.substring(1).replaceAll("\\w", "*");

        String kredikart = str3.substring( 0,14).replaceAll("\\d","*");
        String kredikartGeriyeKalan = str3.substring(14,19);

        System.out.println(IlkHarf + isimgeriyekalan
                + " " + soyIsimIlkharf + soyIsimgeriyekalan
                + "\n" + kredikart + kredikartGeriyeKalan);

    }
}
