package day31_timeFormatter_varrags;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeYazdirma(5,"ali", "ayse", "mustafa", "ahmet", "nida","akin");

        /*
        varargs teorik olarak sonsuz sayida elemnet alabilir
        bir method da parametre olarak varargs varsa en sonda olmasi lazim
        yani parametrelerin sonuncusu olamalidir.

        oncesinde farkli parametler olabilir ama varargs dan sonra parametre olamaz
        bir method da iki tane varargs olamaz.

         */
    }

    public static void enUzunKelimeYazdirma(int kelimeSayisi,String... kelime) {

        String enUzunKelime = kelime[0];

        for (String each : kelime

        ) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }

        System.out.println("girilen kelimelrde en uzunu " + enUzunKelime);
    }

}
