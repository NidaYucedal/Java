package day10_stringmanipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="beni psikopata baglamayin";
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
    }
}
