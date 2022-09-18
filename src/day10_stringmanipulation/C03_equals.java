package day10_stringmanipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "ALİ CAN";
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5=new String("Ali Can");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));

        // stringlerde aynı string olsa bile == herzaman calısmaz
        // emin olmak icin equals() kullanmalısınız

        System.out.println(str3.equals(str5));
        System.out.println(str3==str5);


    }
}
