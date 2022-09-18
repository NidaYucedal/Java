package day12_stringManipulation;

public class Test01_java {
    public static void main(String[] args) {

        //java ogrenmek123 Cok guzel@ bu stringi java ogrenmek cok guzel yazdırın

        String str="Java ogrenmek123 Cok guzel@";
        System.out.println(str.replaceAll("\\d","")
       .replace ( "@",""));
    }
}
