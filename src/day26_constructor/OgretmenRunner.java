package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("ogretmen1" + ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("emre", "akdogan", "1/1/2002",
                "matematik", "fizik");
        System.out.println("ogretmen2 " + ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("cavidan", "yılmaz", "2/1/2002");
        System.out.println("ogretmen3  " + ogretmen3);
    }
}
