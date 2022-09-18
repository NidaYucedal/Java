package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{

    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("mermurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");

    }
    protected void ozelSigorta(){
        System.out.println("memurlar %60 indirimli ozel sigorta yaptirabilir");

    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai); //9
        System.out.println(mmr1.saatUcreti); //12
        mmr1.maas(); //mermurlar : 3240 maas alir
        mmr1.ozelSigorta(); //memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); //personelden alicak
        System.out.println(mmr1.isim); //personelden alir
        System.out.println(mmr1.soyisim); //personelden alir
        System.out.println(mmr1.departman); //personelden alir

        BMuhasebe mhsb1=new BMuhasebe();

        /*
        her ne kadar memur classının icinde olsamda olusturdugum obje muhasebe
        classindan cunku data turu ve constructor Bmuhasebe



        String str="murat";
        ArrayList<Integer>list=new ArrayList<>();
        Integer sayi=20;

        Bmuhasebe class'i da obje olusturulablen bir calss'dir yani data turudur

         */

        System.out.println(mhsb1.gunlukMesai); //8
        System.out.println(mhsb1.saatUcreti); //10
        mhsb1.maas(); //Muhasebe //personel minumun : 2400 maas alir
        mhsb1.ozelSigorta(); //muhasebe
        mhsb1.sigorta(); //personel
        System.out.println(mhsb1.isim); //personelden alir
        System.out.println(mhsb1.soyisim); //personelden alir
        System.out.println(mhsb1.departman); //personelden alir



    }
}
