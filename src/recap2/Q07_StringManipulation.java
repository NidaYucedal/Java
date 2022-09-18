package recap2;

public class Q07_StringManipulation {
    public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

        String str1 = "$13.99";
        String str2 = "$10.55";

        String ilk = str1.replace("$", "");
        String ikinci = str2.replace("$", "");

        double a = Double.parseDouble(ilk);
        double b = Double.parseDouble(ikinci);
        System.out.println(a + b);


    }
}
