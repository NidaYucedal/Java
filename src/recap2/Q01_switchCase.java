package recap2;

public class Q01_switchCase {
    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String gun = "cuma";

        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("java dersi");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("sql dersi");
                break;
            case "persembe":
            case "cuma":
                System.out.println("selenyum dersi");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}
