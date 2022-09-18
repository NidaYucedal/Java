package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str = "java ogrenmek cok guzel";

        //verilen bir string de herhangi bir string veya char ın ilk kullandığı index'i bize dondurur

        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("j")); // -1 döndürür

        System.out.println(str.indexOf("mek"));

        System.out.println(str.indexOf("g", (6 + 1)));
        // yukardaki str da 2. ve 3. e nin indexlerini bulun
        //2. e yi bulabilmek ıcın 1. e nin ındexsine ihtiyacım var

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);
        // eger varsa indexsini yazdıralım
        if (ikincie==-1){
            System.out.println("verilen str da 2. e yok");

        } else {
            int ucuncue= str.indexOf("e", ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str da 3.e yok");
            }else {
                System.out.println("verilen str da 3.enin index'i:"+ ucuncue);
            }
        }



    }
}
