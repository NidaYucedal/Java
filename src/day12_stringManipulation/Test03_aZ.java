package day12_stringManipulation;

public class Test03_aZ {
    public static void main(String[] args) {

        //kullanicidan isim isteyin eger isim a harfi iceriyorsa
        //girdiginiz isim a harfi iceriyor
        //z harfi varsa iceriyor
        //ikiside yoksa girdiginiz isim a ve z icermiyor


        String str1 = "jvs hyt cok zor";


        if (str1.contains("a")){
            System.out.println("a iceriyor");
        }
        if (str1.contains("z")){
            System.out.println("z iceriyor");
        }
        if ((!str1.contains("a")&& !str1.contains("z"))){

            System.out.println("giridiginiz isim a ve z harfi icermiyor");


        }
    }
}
