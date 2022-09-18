package day05_matematikselislemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1=10;

        int sayi2=sayi1+1; // burada sayi2 11 olur
        sayi2+=5; // burada sayi2 16 olur
        // ++ ve -- once veya sonra yazılmasına gore farkli iki islem olur

        int sayi3=sayi2++;  // sayı2 bir artıralacak , sayi2 degeri sayı3 e atanacak
        int sayi4=++sayi1;  // sayi1 bir artırılacak , sayi1 degeri sayi4 e atanacak

        System.out.println("sayi3:"+sayi3);
        System.out.println("sayi2:"+sayi2);

        System.out.println("sayi4:"+sayi4);
        System.out.println("sayi1:"+ sayi1);





    }
}
