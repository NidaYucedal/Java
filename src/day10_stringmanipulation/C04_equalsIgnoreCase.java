package day10_stringmanipulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "ali can";
        String str3 = "ALI CAN";
        String str4 = "Ali Can_";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));

        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));






    }
}
