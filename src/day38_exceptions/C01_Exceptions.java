package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

      /*
        bir sorunla karsilasmayi beklediginiz noklarda
        if else ile sorunu yakalayıp onunla ilgili
        cozum uretebilirsiniz

        ama sorunu her zaman if else ile cozemeyecegimizden
        Java try-catch bloklar'i olusturmustur.
         */


        int a=100;
        int b=50;
        int sayac=1;

        while (sayac<100){
           if (b==0){
               System.out.println("islem yapilirken payda 0 oldu,dikkat etmelisiniz");
           }else{
               System.out.println(a/b);
           }
            b--;
            sayac++;
        }




    }
}
