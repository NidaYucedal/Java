package day11_stringManipulation;


public class Test01_indexOf {
    public static void main(String[] args) {

        String str = ("C'est difficile mais je peux faire");

        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.endsWith("faire"));

        if (str.contains("peux")) {
            System.out.println("pouvoir");
        } else if (str.startsWith("C'est")) {
            System.out.println("bien");

        } else {
            System.out.println("ridicule");
        }


    }
}
