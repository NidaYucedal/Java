package day29_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {


        List<String> list=new ArrayList<>();
        list.add("ali");
        list.add("veli");
        list.add("can");

        System.out.println("ilk basta list "+list); //[ali, veli, can]

        elemanlarDegistir(list);

        System.out.println("elemalar degistir methodundan sonra list "+list); // [oguz, murat, fatih]

        listDegistir(list);

        System.out.println("listDegistir methodundan sonra list "+list); //[oguz, murat, fatih]

    }

    public static void listDegistir(List<String> list) {

        list=new ArrayList<>();
        list.add("nutella");
        list.add("nida");
        list.add("sena");

        System.out.println("listDegistir methodunda "+list); //[nutella, nida, sena]
    }

    public static void elemanlarDegistir(List<String> list) {

        list.set(0,"oguz");
        list.set(1,"murat");
        list.set(2,"fatih");

        System.out.println("eleman degistir methodunda "+list); //[oguz, murat, fatih]





    }
}
