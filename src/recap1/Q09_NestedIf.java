package recap1;

import java.util.Scanner;

public class Q09_NestedIf {
    public static void main(String[] args) {

        /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("yas giriniz");
        int yas= scan.nextInt();

        if(yas>=18){
        }if (yas>=70){
            System.out.println("uc kez oy kullanabilir");
        } else if (70>yas && yas>=50){
        System.out.println("iki kez oy kullanabilir");

            } else if (50>yas && yas>=18 ) {
            System.out.println("bir kez oy kullanabilir");

        }else {
            System.out.println("gecerli yas giriniz");
        }
    }
    }
