package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // 20 den 50 ye cift sayilar

        int baslangıc=20;
        int bitis=50;

        for (int i=baslangıc; i<=bitis; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        int temp=baslangıc;
        while (temp<=bitis){
            if (temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;

        }
    }
}
