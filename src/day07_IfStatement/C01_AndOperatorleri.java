package day07_IfStatement;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        System.out.println(a > 0 && b < 20 && c >= b);

        System.out.println(a < 0 && b < 20 && c >= b);

        // ilk false bulundugunda geriye kalan sartlar onemli degildir
        // ama tek & kullanırsak tum sartlari kontrol eder sonra sunucu yazar

        int s=2;
        int d=3;
        if (s>d); {
        System.out.println(s+d); }

        if (s==d); {
        System.out.println(s*d);}

    }
}
