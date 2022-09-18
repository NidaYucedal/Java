package day11_stringManipulation;

public class Test02_indexOf {
    public static void main(String[] args) {

        String str="C'est compliqué";

        System.out.println(str.indexOf('C'));
        System.out.println(str.indexOf("t"));
        System.out.println(str.indexOf("é"));
        System.out.println(str.lastIndexOf("e"));

        if (str.contains("qué")){
            System.out.println("quelle beauté");
        }if (str.contains("Ces")){
            System.out.println("C'est magnifique");
        }else {
            System.out.println("ridicule");
        }
    }
}
