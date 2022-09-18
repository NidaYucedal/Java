package day17_nestedForLoop;

public class Test06_DoWhileLoop {
    public static void main(String[] args) {

        char a = 'm';
        char b= 'c';


        do {
            System.out.print(Character.toString(a).toUpperCase() + " ");
            a--;

        }while (a >= b);


    }
}
