package day23_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapma {
    public static void main(String[] args) {

        //list ile calisirken en kotu ozelligi elemanlari tek tek eklemek


        Integer[] arr = {2, 3, 4, 5, 6, 8, 4, 2, 6};

        //bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine
        //array olusturup for loop ile olusturdugumuz list'e tasiyabiliriz

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);


        }
        System.out.println("sayilar " +sayilar);

        //bu islemi yapmasi icin javanin olusturdugu bir method da var
        //ancak bu yontemin cok yan etkisi var

        //1-bu sekilde olusturulan listede add remove gibi size i degistiren methodlar kullanilamaz
        // sayilar2.add(5); bu kod calısmaz



        List<Integer>sayilar2= Arrays.asList(arr);//[2, 3, 4, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        System.out.println(sayilar2);


        sayilar.add(5);
        System.out.println(sayilar);

        // sayilar2.add(5);
        // System.out.println(sayilar2); exception verir


        arr[0]=20;
        System.out.println(Arrays.toString(arr));//0 indexi 20 yapar

        System.out.println(sayilar2);
        //2-asList methodu ile olusturulan liste ve kaynak olan array biriri ile ilisik
        //olarak hayatlarina devam ederler
        //birinde yaptigimiz degisiklik otamatik olarak digerine de isler

        









    }
}
