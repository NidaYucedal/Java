package day15_overloading_forLoop;

import java.util.Scanner;

public class Test06_ForLoop {
    public static void main(String[] args) {
        /*
         Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
         girilen sayiya kadar tum sayilari yazdirin. Ancak;
          - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
          - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
          - Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin

           */

      Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk pozitif tamsayi giriniz");
        int sayi= scan.nextInt();

        for(int i=1; i<=sayi; i++){
            if (i%3==0 && i%5==0){
                System.out.print("java guzeldir"+"\n");
            } else if (i%5==0) {
                System.out.print("guzeldir"+" ");
            } else if (i%3==0) {
                System.out.print("java"+" ");
            }else {
                System.out.print(i+" ");
            }
        }
    }
}
