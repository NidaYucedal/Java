package practiseday13_interviewQusetions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        /*
         Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         0-1-1-2-3-5-8-13-21-34....
        */

        List<Integer> list = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi=scan.nextInt();
        list.add(0);
        list.add(1);
        System.out.println("fibonacci : "+list);

        int i=1;

        if (sayi<=1){
            System.out.println("daha buyuk rakam gir");
        }else{
            while (list.get(i)<sayi){
                list.add(list.get(i)+list.get(i-1));
                i++;

            }
            System.out.println("fibonaccilist = " + list);
        }


        int sonIndex=list.size()-1;
        if (list.get(sonIndex)>sayi);
        list.remove(sonIndex);
        System.out.println(list);
    }
}
