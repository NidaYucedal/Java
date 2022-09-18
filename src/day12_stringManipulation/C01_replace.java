package day12_stringManipulation;

public class C01_replace {
    public static void main(String[] args) {

     String str= " Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));

        //hava yazalim
        System.out.println(str.replace("h","J").replace(" ",""));

        // guzel yerine harika yapalim
        System.out.println(str.replace("guz el","harika").replace(" ",""));

        // cumleyi replace kullanarak bugun java cok guzel yapalım

        str=str.replace("Bu gun","Bugun")
                .replace("ha va", " java")
                .replace("guz el ", "guzel");
        System.out.println(str);

    }
}
