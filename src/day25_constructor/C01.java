package day25_constructor;

public class C01 {

    //java OOP konsept kullandigi icin olusturulan her bir classın
    // ihtiyac oldugunda obje uretebilmesine
    //uygun dizayn etmistir
    //ama her class dan obje uretilmeyebilir
    //bunun icin java ihtiyac halinde kullanılmasi icin her class ta default bir constructor koymustur
    //bu default constructor class tan obje olusturuldugunda otamatik olarak calisir
    //ornegin bu classta constructor gorulmemesine ragmen C02 clasında icinde oldugumuz C01 classından bir
    //obje uretebildik



    int sayi;
    public void deneme(){
        System.out.println("C01 den deneme methodu calıstır");
    }
}
