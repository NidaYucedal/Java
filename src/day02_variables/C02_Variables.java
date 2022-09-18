package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {
        int sayi=10;
        boolean guzelMi=true;
        char sayim='3';

        System.out.println(sayi);

        String isim="Nida";
        String soyisim="Yucedal";
        System.out.println("isminiz:"+isim);
        System.out.println("soyisminiz:"+soyisim);

        int sayi1=12;
        int sayi2=7;
        int toplam=(sayi1+sayi2);
        System.out.println(sayi1+sayi2);

       int s1=13;
       double s2=12.8;
        System.out.println(s1+s2);

        char a='2';
        char b='3';
        System.out.println("a+b=2+3");

        int t=14;
        char r='7';
        System.out.println(t+r);



        //10 ve 20 yer temp kullanarak degistirme//

        int ss1=10;
        int ss2=20;
        int temp=ss1;
        ss1=ss2;
        ss2=temp;
        System.out.println("swaptan sonra ss1:"+ ss1 + " , ss2: "+ ss2);





    }
}
