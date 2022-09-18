package practise10_day11;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

         /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
            hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
    */

        /*


        daha oncelikler Scanner obj olusturcaz
        oncelikler split methodu kullanicaz
        sonra sort yapcaz
        for loop a alcaz
        if ile control yapicaz ve sout ile yazdiracaz

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("bir string ifade giriniz: ");
        String str=scan.nextLine();

        String[] arr=str.split("");
        System.out.println("arr: "+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("arr nin sort lanmis hali : "+Arrays.toString(arr));

        int counter=0;

        for (int i = 1; i <arr.length; i++) {
            if(arr[i-1].equals(arr[i])){
                counter++;
            }else{
                System.out.println(arr[i-1] +"harfi "+ (counter+1));
                counter=0;
            }
            if (i==arr.length-1){ //yani for loop ta en sona geldiginde
                System.out.println(arr[i-1] +"harfi "+ (counter+1));
            }




        }


    }
}
