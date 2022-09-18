package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {


        String str="1234a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {

            System.out.println("yazdiginiz deger sadece rakamlardan olusmalidir");
        }catch (Exception e) {
            System.out.println("ongorulemeyen bir hata olustu");
        }



        System.out.println("sayinin karesi: "+ sayi*sayi);

        /*
        kullanicidan string olarak bir deger  aliyor
        ve bunu int ceviriyorsak NumberFormatException ile
        karsilasabilecegimizi ongoruruz
        NFE aldigimizda kodun durmamasini istiyorsak try cacth ile cevreleyebiliriz

        Eger bilmedigim bir exception daha olusursa kodun durmasini sitiyorsak
        bir kere daha cacth cumlesi ekleyip ona en genis exception'ni yazabilirz
         */
    }
}
