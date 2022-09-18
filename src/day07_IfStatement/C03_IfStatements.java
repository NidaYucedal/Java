package day07_IfStatement;

public class C03_IfStatements {
    public static void main(String[] args) {

        int sayi =10;
        if (sayi > 0) {
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir");
        }
        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
            System.out.println("cift kalacaktir");
        }

        if (sayi % 5 == 0) {
            System.out.println("sayi 5'in kati");

        }

        // bir if statement da { kullanılmazsa java ilk satırı sart ile baglar
        // sonraki satirlar bagimsiz olur



    }
}


