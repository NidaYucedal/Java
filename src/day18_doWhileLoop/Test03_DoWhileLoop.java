package day18_doWhileLoop;

public class Test03_DoWhileLoop {
    public static void main(String[] args) {


        /*soru 1) 9 dan 190 kadar
       7 nin kati olan tum tamsayilari yazdirin
       */

        int bas = 9;

        do {
            if (bas % 7 == 0) {
                System.out.print(bas+" ");

            }
            bas++;


        } while (bas <= 190);


    }
}
