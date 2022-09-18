package day09_TernaryOperator;

public class C06_SwitchCase {
    public static void main(String[] args) {


        // kullanicidan gun ismini alin
        // hafta ici veya hafta sonu oldugunu yazdirin


        String input = "pazar";
        input=input.toLowerCase();

        switch (input) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gecerli bir gun giriniz");

        }

    }
}
