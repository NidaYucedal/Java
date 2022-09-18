package day29_passByValue_immutableClasses;

public class C04_immutableClass {
    public static void main(String[] args) {


     /*
     immutable:degistirilemez
     mutable:degistirilebilir

     en meshur immutable class:String
      */

        String str = "Yildiz Bank";
        System.out.println(str.toUpperCase()); //YILDIZ BANK
        str.toLowerCase();
        System.out.println(str); //Yildiz Bank

        str.substring(3, 5); //di
        System.out.println(str);




    }
}
