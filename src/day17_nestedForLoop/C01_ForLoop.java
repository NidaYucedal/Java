package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //verilen string deki kullanılan harfleri
        // tekrarsız olarak yazdırıp kelimede
        //kullanılan farklı harf sayisini veren bir method

        String input = "taka tuka";

        tekrasızYap(input);


    }

    public static void tekrasızYap(String input) {

        String benzersizInput = "";

        String isleneceKelime = input.replaceAll("\\W", "");
        System.out.print(isleneceKelime.substring(0, 1));
        benzersizInput += isleneceKelime.substring(0, 1);

        for (int i = 0; i < isleneceKelime.length(); i++) {

            if (!benzersizInput.contains(isleneceKelime.substring(i,i+1))){
                System.out.print(","+isleneceKelime.substring(i,i+1));
                benzersizInput+=isleneceKelime.substring(i,i+1);


            }


        }
        System.out.println("");
        System.out.println("input:"+input);
        System.out.println("benzersizInput:"+benzersizInput);
        System.out.println(benzersizInput.length());


    }
}
