package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {

        //soyismi can olanlarin bransini dataScience yapalim

        Map<Integer,String>sinif= ReusableMethods.mapOlustur();

        //entry leri alalim
        Set<Map.Entry<Integer,String>>entrySeti=sinif.entrySet();

        String entryValue;
        String []entryArr;

        for (Map.Entry<Integer,String> entry : entrySeti){

            entryValue=entry.getValue();
            entryArr=entryValue.split(", ");

            if(entryArr[1].equals("Can")) {
                entryArr[2] = "DataScience";

                entry.setValue(entryArr[0] + ", " + entryArr[1] + ", " + entryArr[2]);

            }

        }
        System.out.println(sinif);
    }
}
