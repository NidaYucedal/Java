package day13_MethodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {

        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String str = "  Java ogrenmek123 Cok guzel@  ";
        str = str.trim(); // Java ogrenmek123 Cok guzel@
        str = str.replaceAll("\\d", "");// Java ogrenmek Cok guzel@
        str = str.replace("@", ""); // Java ogrenmek Cok guzel
        str = str.replace("C", "c"); // Java ogrenmek cok guzel
        str = str + "."; // Java ogrenmek cok guzel.
        System.out.println(str); // Java ogrenmek cok guzel.


        String str1 =  "Can, Cananlara gitmek icin can atiyor";;
        System.out.println(str1.replace("Can", "Turk"));

        int y = 20;

        System.out.println((y >= 20) ? (2 + y) : (y-3));

        int x = (12 > 5) ? (12<=13 ? 2*12 : 3*12) : (12<4 ? 23+12 : 32+12);
        System.out.println(x);
    }
}
