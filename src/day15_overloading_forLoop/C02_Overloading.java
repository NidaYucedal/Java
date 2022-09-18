package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        /* javada olusturdugumuz methodlarin isminin yaptigi islev ile uyumlu olmasini isteriz
        mesela bir string in bir bolumunu almak icin java 2 adet substring()
        methodlari veya verilen stringdeki
        bazi parcalari yenileri ile degistirmek icin 2 adet replace() methodu var


        java ayni isimde birden fazla method varsa hangisinin kullanılacagına parametre sayısı ve
        parametrelerin data türüne gore karar verir.
         */

        String str = "Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);
        str.replace('c', 'v');

        /*
        ayni isimde ama farkli methodlari olusturmak icin
        degistirebilecegimiz seyler
        1-parametre sayisi
        2-ayni sayida parametreye sahip olsa bile parametrelerin data turleri
        3-ayni sayida ve ayni data turunde parametreleri olan methodlarda
        parametrelerin  siralanisi
         */

    }
}
