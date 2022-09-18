package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {
        String str1="java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+""+sayi1+sayi2);
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));
        System.out.println(sayi1+sayi2+" "+str1);
        System.out.println(""+sayi1+sayi2);
        System.out.println( str1.concat(str2));
        System.out.println(str1.concat(" ").concat(str2));


    }
}
