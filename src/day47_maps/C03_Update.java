package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {


        /*
        map.contains(key) ==>verdigimiz key in map de olup olmadigini boolean doner
        map.contains(value) ==>bir butunn olarak value nun map de olup olmadigini doner

        NOT: map.contains(value) ==> value nun icindeki bir parcayi bulmada ise yaramaz
             eger value icindeki bir parcayi aratmak istiyorsak
             map uzerinde manipulation yapmamiz lazim

             map.get(key) ==> verilen key e ait degeri dondurur

         */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104));//true
        System.out.println(sinifListMap.containsKey(110));//false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true
        System.out.println(sinifListMap.containsValue("JDev"));//false (tek deger donmez)

        //verilen map de JDev degerlerini JavaDeveloper olarak degistirin
        //map'lerde replace tum value yu degistirmek istersek kullanilabilir
        //kismi degisikliklerde kullanmayiz

        Collection<String>valueCollection=sinifListMap.values();

        for (String each:valueCollection) {
            each=each.replace("JDev","JavaDeveloper");
            System.out.println(each);//for each loop icinde yapilan burada kalir
            //map degismedi


        }


        //mapi guncellemek icin key,yenideger i map e eklemeliyiz
        //ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin sinifListMap.(101,Ali, Can, JDeveloper)
        //bunu yapabilmek icin herbir key'e ve ona ait valuye ihtiyacim var

        Set<Integer> keySeti=sinifListMap.keySet();
        String value;

        for (Integer each:keySeti) {

            value=sinifListMap.get(each);
            value=value.replace("JDev","JavaDeveloper");
            sinifListMap.put(each, value);

            //biz key'lerin tamamini aldik
            //herbir key in value sini get'irdik
            //value uzerinden degisikligi yapip yeni halini put(key,yenideger)ile map e koyduk
            //İçerikte değişim olacaksa mutlaka key bilgisi olacak elimizde. En önemli detay bu.

        }

        System.out.println(sinifListMap);

    }
}
