package day12_stringManipulation;

public class Test02_fiyat {
    public static void main(String[] args) {

        // verilen iki sayının toplamı
        String str1 = "$13.99";
        String str2 = "$10.55";

        String ilk= str1.replace("$","");
        String ikinci=str2.replace("$","");



        double a=Double.parseDouble(ilk);
        double b=Double.parseDouble(ikinci);


        System.out.println(a+ b);

    }
}
