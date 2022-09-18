package day32_stringBuilder;

public class C05_indexOf_lastIndexOf {
    public static void main(String[] args) {



        StringBuilder sb = new StringBuilder("pay attention please");

        System.out.println(sb.indexOf("pay"));//0

        System.out.println(sb.lastIndexOf("please"));//14

        System.out.println(sb.indexOf("e"));//7

        System.out.println(sb.indexOf("e", 10));//16

        System.out.println(sb.lastIndexOf("e"));//19 sondaki e

        System.out.println(sb.lastIndexOf("e", 10));//7

    }
}
