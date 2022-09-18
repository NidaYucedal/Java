package day31_timeFormatter_varrags;

public class C04_VarargsIleEnUzunKelimeYazdirma {
    public static void main(String[] args) {


        enUzunKelimeYazdirma("ali","ayse","mustafa","ahmet","nida");
    }

    public static void enUzunKelimeYazdirma(String...kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime

        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }

        System.out.println("girilen kelimelrde en uzunu "+enUzunKelime);
    }

}
