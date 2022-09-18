package day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir.");
    }

     /*

    Private methodlar override edilemez
    Eger child class'da parent class'daki private method
    ile ayni signature'da bir method olusturursaniz
    bu overriding method olmaz

     */

    @Override
    void marka() {

        /*

         @Override notasyonu javaya bir gorev verir
         java,bu notasyonla birbirine bagli olan iki method'u
         surekli kontrol eder
         Eger parent class'daki overriden method'nu silerseniz
         CTE verir.

         @Override notasyonu kullanmak mecburi degildir
         Eger Overriding muthod silinirse kodun CTE vermemesini
         istersek @Override notasyonu kullnamliyiz


         */
    }

}
