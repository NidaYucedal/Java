package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {


    public static void main(String[] args) {

        C01 obj = new C01();
        //C01 class adi
        //obj obje adi
        //new keyword
        //C01(); constructor(yapici)
        //1- Obje olusturmak icin constructor kullanmak zorundayiz
        //2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
        //3- Her class'da gormesek bile Java'nin koydugu default constructor vardir

        //obje olusturmak icin mutlaka yazmamız gerek keyword;
        //constructer obje üretmek icin mutlaka olması gereken bir yapıdır
        //bu yapıyı java kontrol eder. oop consept olması icin kalıplardan yani classlardan obje oretmemiz lazım
        //java bu yetiyi constructer vasıtasıyla kullanıyor
        //yani biz bir objeyi olusturmak icin class a ihtiyacımız var, class ında objeyi olusturabilmesi icin constructer a ihtiyacı var
        //costructer javanın obje olusturmak icin kullandığı kod bloğudur.
        //javamızın obje üretmesine imkan tanır.

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> list=new ArrayList<>();
        //ne zaman bir obje olustursak gördüğümüz gibi hep parantezli bir seyler var
         //  List<String> list2=new List<>();
        // new list diyemezsiniz cünkü interface tir ve obje olusturamazsınız

        /*
        Java da bir obje olusturabilmek icin
        mutlaka constructer kullanmalısınız.
         */

        /*
        Bir objeden bahsediyorsak CONSTRUCTER CALISACAK! baska türlü mümkün değil
         */

       //aynı kalıbı kullanarak baska constructer ile farklı özelliklerde ama aynı class ın özelliklerini tasıyan
        // farklıymıs gibi görünen objeler üretebilirsiniz
        // kalıp aynı ama desenler farklıdır, dısardan baktığınızda farklı görünür.
        //ama temelde özelligi bütün objeler kalıbın özelliğini taşır,
        // yani kalıbın 2 kolu varken diğerlerinin de 2 kolu olur
        //YANNİİİİ aynı kalıbı kullanarak birden fazla obje üretebilirz

        //Constructor variable veya method değildir, yepyeni bir yapıdır.

        //obje olusturmayı siparix vermeye benzetebiliriz.
        //diyelim ki erkek tshirtü üretiyoruz, bir müşteri arasa dese ki bana tshirt üret
        //bunu dediğinde bana hic bir özellik vermedi, sadece üret dedi o zaman ben hic tshirt bile üretmem elimde kalan ne kadar varsa hepsini gönderebilirim
        // dolayısı ile ben bir tshirt üret dersem  public Uret(); elde ne varsa o gelir hic bir özelligi yok
        // bana yesil tshirt üret dese ben yine public Uret(yesil); üret emrini alırım ama parametre olarak yesil dediği icin yesili yazarım
        // yesil olan istedigimiz tarzta üretiriz
        // bana yesil v yaka üret derse public Uret("yesil, "V yaka"); parametrelerini eklerim.

        //parametreleri  ne zaman kullanıyoruyz, specifik bir ürün istediğimiz zaman
        //cünkü biz neyi istiyorsak parametreler bizimle constructer arasında bu iletisimi sağlar

        System.out.println(obj.sayi);//obj1 üzerinde c01 classindaki sayiyi alabildik//
        //instansce değer, default değer yazar cunku sayının atanmıs bir değeri yok.

        //yukarıda ürettiğimiz objeyi kullanarak bilgileri burada aldık

        obj. deneme(); //obj1 üzerinden yazdığımız deneme methodunu calıstırabiliyoruz

    }
}