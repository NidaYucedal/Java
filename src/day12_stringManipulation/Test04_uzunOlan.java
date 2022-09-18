package day12_stringManipulation;

public class Test04_uzunOlan {
    public static void main(String[] args) {

        //kullanicidan isim ve soyisim isteyin
        // hangisi daha uzun yazdırın

        String str1 = "Nida";
        String str2 = "Yücedal";

        if (str1.length() > str2.length()) {
            System.out.println(str1);
        } else {
            System.out.println(str2);
        }
    }
}
