package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {


        List<String>liste=new ArrayList<>();
        // liste.add(5);
        //liste.add('s');
        // liste.add(true);

        List<Object> list=new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("nida");
        System.out.println(list);

        list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(3)+" can"); //3.indexe can ekle
        list.set(2,!(Boolean)list.get(2));
        list.set(1,(char)list.get(1)+ 'a');
        System.out.println(list);

        Set<Object> set1=new HashSet<>(); //sirali verir
        set1.add(5);
        set1.add(true);
        set1.add('5');
        set1.add(3);
        set1.add("Ali");
        System.out.println(set1);
    }
}
