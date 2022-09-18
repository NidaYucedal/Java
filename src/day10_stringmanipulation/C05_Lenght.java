package day10_stringmanipulation;

public class C05_Lenght {
    public static void main(String[] args) {

        String str = "java ogren, isi kap";

        System.out.println(str.length());
        System.out.println(str.charAt(str.length() - 1));

        System.out.println(str.charAt(str.length() - 3));

        // javada null pointer (isaretleyici) bir deger degil
        // karsısına yazıldıgı variable nın hicbir deger almadıgının isaretcisidir

        String str2 = "";
        String str3 = null;//null bir esitligin karsinda olsa bile bu bir atama degildir

//esitligin karsisina null yazarsak bu bir atama degildir, null sadece deger atanmadiginin isaretcisidir
    }
}
