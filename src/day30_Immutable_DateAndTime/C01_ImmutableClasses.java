package day30_Immutable_DateAndTime;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClasses {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("kenan");
        list.add("enes");
        list.add("ismail");
        System.out.println(list); //[kenan, enes, ismail]

        list.set(1,"yasemin");
        System.out.println(list);//[kenan, yasemin, ismail]

        list.remove("ismail");
        System.out.println(list); //[kenan, yasemin]


    }
}
