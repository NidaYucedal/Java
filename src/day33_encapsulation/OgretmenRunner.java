package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());//setisim ile deger atatdik getisim ile yazdirdik

        /*
        bu yontemle data hiding degil
        daha anlasilir bir kod amaclanmis oldu
         */




    }
}
