package day32_stringBuilder;

public class C04_subsequence {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);
        System.out.println(sb.substring(0,3)); //Kay


        sb.subSequence(0,3);
        System.out.println(sb.subSequence(0,3));//Kay


    }
}
