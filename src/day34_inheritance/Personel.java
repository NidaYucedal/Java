package day34_inheritance;

public class Personel {



        // 1- Child Classlar parent classlar daki tüm özelliklere sahiptir
        // 2- Child Classlar parent classlardaki bazı özellikleri kendine uyarlayabilir
        // 3- Child classlar parent classlarda olmayan bazı extra özelliklere sahip olabilir.

    /*
    eger parent class olacak sekilde tasarladigimiz bir class varsa veya
    ilerde bu class'i parent yapmak isteyenler olabilir
    diyorsanız variable ve methodlarin access modifier'ini
    protected yapariz
     */

    protected int persNo;
    protected String isim="isim belirtilmedi";
    protected String departman="departman belirtilmedi";

    protected void maas(){

        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){

        System.out.println("tum personel statusune gore mesai yapar");

    }

    protected void fazlaMesaiUcreti(){

        System.out.println("personel fazla mesai ucretini statusune gore alir");


    }
}
