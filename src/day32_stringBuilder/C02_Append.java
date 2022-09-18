package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        sb.append("?"); //sona eklenir
        System.out.println(sb);

        System.out.println(sb.append("java", 2, 4));

        //append istedigimiz String'i en sona ekler

        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb);

        //araya ekleme yapmak icin insert kullaniriz


        System.out.println(sb.insert(22, "valla valla", 5, 11));



    }
}
