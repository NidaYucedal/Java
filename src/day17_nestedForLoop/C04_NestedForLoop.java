package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        // verilen input a gore yıldızlardan olusan bir ucgen olusturun
        //input 4ise
        //*
        //* *
        //* * *
        //* * * *

        int input = 9;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
