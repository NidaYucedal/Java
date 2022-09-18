package day25_constructor;

public class C03 {


    //proje olurtururken bazi classlardan run etmek icin degil
    //variable ve method olusturup
    //bunlari baska class lardan kullanmak icin olusturulur

    //default constructor parametresizdir
    //goremezsek bile ihtiyac oldugunda calisir
    //class icerisinde parametreli veya parametresiz herhangi bir
    //constructor olusturduysak java default constructor ı siler

    C03(){

    }

    //olusturdugumuz parametresiz bu constructor default constructor ile
    //birebir aynidir ama biz olusturdugumuz icin buna default constructor
    //demeyiz parametresiz constructor deriz.

    String isim="etka";
    public void method01(){
        System.out.println("C03 method calisti");
    }
}
