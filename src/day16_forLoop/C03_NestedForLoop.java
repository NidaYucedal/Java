package day16_forLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {


        /*
        bazen tek degisken sorunu cözemeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *

         */

        // 3 tane * yanyana

        for (int i = 1; i <= 3; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
        for (int i = 1; i <= 4; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");

        //bu tur durumlarda ic ice loop kullanmak gerekir

        for (int i = 1; i<=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }












    }
}
