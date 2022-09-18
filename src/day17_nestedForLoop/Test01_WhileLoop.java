package day17_nestedForLoop;

public class Test01_WhileLoop {
    public static void main(String[] args) {

        // while loop kullanrak 3 ten 13 e kadar olan tum tek sayıları yazdırın

        int baslangıc = 3;
        int bitis = 13;


        while (baslangıc <= bitis) {
            if (baslangıc % 2 == 1) {
                System.out.print(baslangıc + " ");
            }
            baslangıc++;

        }
    }
}
