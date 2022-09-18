package day14_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {


        //verilen uc basamakli bir sayini rakamları toplami yazdıran bir method

        int input = 423;
        rakamlariTopla(input);


    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int temp = input;


        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        System.out.println("girdiginiz" + temp + "sayinin rakamlar toplami:" + rakamlarToplami);
    }


}
