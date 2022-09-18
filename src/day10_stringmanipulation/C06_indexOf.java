package day10_stringmanipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str= "java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("t"));

        String str5="jskhahdkugalkasdlsajdfgdfgjkdflıew";
        // str 5 te p harfi var mıdır

        if (str5.indexOf("p")==-1) {
            System.out.println("kullanılmamıs");

        }else
            System.out.println("kullanılmıs");

    }
}
