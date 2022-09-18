package practise8_day09.restourant;

public class Mutfak {


    public String yemekler = "adanakebap,kusbasi,kusleme";
    public String araSicak = "yaylavorba,mercimek,corba";
    public String tatlilar = "baklava,sutlac,gullac,kunefe";
    public String icecekler = "ayran,salgam,kola";


    public Mutfak() {
    }


    public Mutfak(String adanakebap, String mercimek, String kunefe) {

        yemekler = adanakebap;
        araSicak = mercimek;
        tatlilar = kunefe;
    }


    @Override
    public String toString() {
        return
                "\nyemekler=" + yemekler +
                        "\naraSicak= " + araSicak +
                        "\ntatlilar= " + tatlilar +
                        "\nicecekler= " + icecekler
                ;


    }
}
