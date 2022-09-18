package day11_stringManipulation;

public class C05_endsWith {
    public static void main(String[] args) {

        String str = "ah be java";
        System.out.println(str.endsWith("ava"));
        System.out.println(str.endsWith("be java"));
        System.out.println(str.endsWith("ah be java"));
        System.out.println(str.endsWith(""));

    }
}
