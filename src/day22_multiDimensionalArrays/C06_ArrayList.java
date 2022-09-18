package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList {
    public static void main(String[] args) {

        //arrayin array yapan sembol [] idi
        //arrayList de ise <> diamond kullaniriz


        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        //bir list e eleman eklemek istersek

        isimler.add("Basak");
        System.out.println(isimler.add("ayse"));// true doner
        System.out.println(isimler);

        // stringde bir method calistirdigimizda assign yapmazsak string degismiyordu

        //string isim="süleyman"
        //isim.toUpperCase(); //SULEYMAN
        //sout(isim) yapınca suleyman yazdırır cunku atama yok
        //list in tek kotu tarafı array alt yaoısını kullandigi icin elemanlari birer birer ekleriz






    }
}
