package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.fiyat = 150000;
        car1.yil = 2020;
        car1.marka = "Toyota";

        System.out.println("Car1 bilgileri\nMarka: " + car1.marka + "\nModel: " + car1.model
                + "\nYil: " + car1.yil + "\nfiyat: " + car1.fiyat);

         Car car2=new Car();
        System.out.println("Car2 bilgileri\nMarka: " + car2.marka + "\nModel: " + car2.model
                + "\nYil: " + car2.yil + "\nfiyat: " + car2.fiyat);

        /*
         herhangi bir obje uzerinde bir variable olusturmaya calıstıgımızda
         java degeri su sira ile arar
         1-o obje olusturulduktab sonra bir deger atadı mı bakar
         2-objenin olusturuldugu classta variable a bir degr atanmis mi bakar
         3-o zaman data turune gore java default degeri atar yilin data turu 0 olur
         */


    }
}
