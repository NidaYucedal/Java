package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {


        int a=100;
        int b=50;
        int sayac=1;

        while (sayac<100){

          /*
        try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
                  islemleri yazmak icin kullanilir
        catch'den sonraki parantez karsilasmayi bekledigimiz exception
                  turunu Javaya soylemek icin kullanilir
        catch blogu  : Java'ya soyledigimiz exception(isnisnai durum) gerceklesirse
                   Java'nin yapmasini istedigimiz islem

                   CATCH blogunun onundeki paranteze karsilasmayi
                   bekledigimiz exception'i yazabilir veya her turlu exception'da
                   devreye girmesini istiyorsak tum exceptionlarin parenti olan
                   exception yazabiliriz


         1. TRY KISMI: yapilmak istenen islem.
         2. Yakalanmasi istenen EXCEPTION turu ve yakalaninca icine konacak obje.
         3. CATCH BLOGU: problem yakalandigindan ne yapilacagi belirtilen bolum.

         */

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu, dikkatli ol");
            }

            b--;
            sayac++;
        }

    }
}
