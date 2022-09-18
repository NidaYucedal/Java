package day17_nestedForLoop;

public class Test03_WhileLoop {
    public static void main(String[] args) {

        // Soru 4) Kullanicidan baslangic ve bitis haflerini alin
        //         ve baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
        //         Kullanicinin hata yapmadigini farz edin.


        char c = 'd';
        char a = 'y';


        while (c <= a) {
            System.out.print(Character.toString(c).toUpperCase() + " ");
            c++;
        }
    }
}
