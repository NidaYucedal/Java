package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2=new StringBuilder("java");

        String str="java";

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(str));//false //iki farkli obje birbiri ile karsilastırilmaz
        System.out.println(sb1.equals(sb1));//true

        //string builder da equals ancak aynı deger olursa true doner
        //stringteki gibi dusunmemek lazım


        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3= new StringBuilder("jave");

        System.out.println(sb1.compareTo(sb3));//-4



        
        /*
     compareTo() iki stringBuilder'i bastan baslayarak
     harf harf karsilastirir
     ilk harfler ayni ise, ikincilere gecer
     ikinciler ayni ise 3.lere gecer ve
     ilk farkli olan harfe kadar gider
     farkli olan iki harfin ascii kodlari arasindaki farki verir

      eger hic farkli harf yoksa
     sonuc olarak 0 dondurur
      */


    }
}
