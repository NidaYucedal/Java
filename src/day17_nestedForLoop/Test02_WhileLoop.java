package day17_nestedForLoop;

public class Test02_WhileLoop {
    public static void main(String[] args) {

        // Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan
        //  15, 20 ve 90’na tam bolunebilen sayilari yazdirin.

        int baslangıc=100;
        int bitis=999;

        for (int i=baslangıc; i<=bitis; i++) {
            if (i%20==0 && i%90==0 && i%15==0){
                System.out.println("20 ye 5o ye ve 90 a tam bolunenler: "+i);
            }

        }


        int sayi=100;

        while (sayi<=999){
            if (sayi%20==0 && sayi%90==0 && sayi%15==0){
                System.out.print(sayi+" ");
            }
            sayi++;
        }


    }
}
