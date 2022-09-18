package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

         /*
          Java Entry<K,V> map'in ivcerisinde bulunan her bir kaydi
          K=V seklinde tutar
          dolayisiyla herhangi bir Entry'e ulastigimizda
          hem key'e hem de value'ya ulasabilir ve istedigimiz islemleri yapabiliriz
          entry.getKey() bize key'i getirir
          entry.getValue() bize value'yu getirir
          entry.setValue() value'yu istedigimiz deger olarak update eder
         */

        Map<Integer,String>sinif= ReusableMethods.mapOlustur();

        System.out.println(sinif);

        //herbir elemani alt alta yazdirin

        Set<Map.Entry<Integer,String>> sinifEntrySet=sinif.entrySet();

        for(Map.Entry each:sinifEntrySet){
            System.out.println(each);
        }

        //mapin tum elemanlarininda varsa tester kurs ismini qa olarak degisitirelim

        String value;

        for (Map.Entry<Integer,String> each:sinifEntrySet){
            value=each.getValue();
            value=value.replace("Tester","QA");
            each.setValue(value);
        }
        System.out.println(sinif);
    }
}
