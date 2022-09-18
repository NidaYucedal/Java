package day11_stringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {

        String input= "java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("j"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun", 5));




    }
}
