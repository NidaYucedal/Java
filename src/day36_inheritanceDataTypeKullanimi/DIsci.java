package day36_inheritanceDataTypeKullanimi;

import day34_inheritance.Isci;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{


    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void Isci(){
        System.out.println("isciler : "+(30*saatUcreti*gunlukMesai)+" maas alir");

    }
    protected void ozelSigortaIsci(){
        System.out.println("isciler %70 indirimli ozel sigorta yaptirabilir");

    }


    public static void main(String[] args) {


        /*
        bir obje olusturulurken data turu
        ve constructor ayni class'tan ise
        direk o class'a gidiyorduk

        eger data turu ve constructor farkli
        ise obje constructor'in oldugu class'in objesidir
        ancak bizden istenen isci class'indaki spesifik ozellikler degil
        bir iscinin muhasebe class'indaki tum calisanlara
        beraber sahip oldugu genel ozellikleri yazdirir


         */

        BMuhasebe isc1=new DIsci();
        System.out.println(isc1.gunlukMesai); //
        System.out.println(isc1.saatUcreti); //
        isc1.maas(); //
        isc1.ozelSigorta(); //
        isc1.sigorta(); //
        System.out.println(isc1.isim); //
        System.out.println(isc1.soyisim); //
        System.out.println(isc1.departman); //

        APersonel isc2 = new DIsci();

        //System.out.println(isc2.gunlukMesai); // M 8
        //System.out.println(isc2.saatUcreti); // M 10
        //isc2.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyisim); // P
        System.out.println(isc2.departman);// P
        /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */
        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */


    }

}
