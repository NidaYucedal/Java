package day34_inheritance;

public class Isci extends Personel{

    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    java'da ise child class'lar ozelliklerini inherit etmek istedikleri class'i
    kendilerine parent edinirler.tercih hakki child'indir.

    mesela isci class'i olusturunca nelere ihtiyaci var diye
    dusunursek personel class'indaki tum variable ve methodlara ihtiyaci oldugunu
    gorebiliriz.
    Bu durumda yeniden o variable ve methodlari olusturmak yerine
    personel class'ini kendimize parent ediniriz.

    bir class'i parent edinmek icin extends keyword kullanmaliyiz.

    bir class baska bir class'i parent edindiginde
    1-parent class'taki tum ozelliklere(varibale+method)otomatik olarak sahip
    2- parent class'taki ozelliklerden bazilarini kendine uyarlayabilir
    3- parent class'ta olmayan bazi yeni ozellikler olusturabilir

    not:parent class'daki ozelliklerden hicbirini reddedemez
    ama degistirebilir

     */

    int persNo=1001;
    public static void main(String[] args) {


        Isci isci1=new Isci();
        System.out.println(isci1.isim);//isim belirtilmedi
        isci1.isim="selim";
        System.out.println(isci1.isim);
        System.out.println("persno "+isci1.persNo); //1001

        isci1.maas();


    }

    public void maas(){
        System.out.println("ısciler minumum 15 euro saat ucreti alir");

    }

    public void ozelSigorta(){

        System.out.println("iscilerden isteyene %50 indirimli ozel sigorta yapilir");
    }


}
