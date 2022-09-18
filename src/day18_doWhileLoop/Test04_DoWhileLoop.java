package day18_doWhileLoop;

public class Test04_DoWhileLoop {
    public static void main(String[] args) {

        /*
     soru 2) m harfinden baslayarak
     c  harfine kadar tum harfleri yazdiirn

       */

        char a='m';
        char b='c';


        do {
            System.out.print(a+" ");
            --a;

        }while (a>=b);


    }
}
