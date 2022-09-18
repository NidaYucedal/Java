package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;


        /*
         System.out.println(str); deger atamasi yapmadan
         bir variable'i kullanmaya calisirsaniz java compile timeda bunu
         farkeder ve izin vermez
         */

        str=null;
        // System.out.println(str.length());
        //NullPointerException



        Object obj="java java java";
        Integer sayi=(Integer) obj;

        // String str2="hava civa";
        //Integer sayi2=str2;
        //java bazi casting islemlerine compile time da izin vermez
        //ancak bazen syntax uygun olablir bu durumda java kodun calismasina izin vermez
        //ClassCastException





    }
}
