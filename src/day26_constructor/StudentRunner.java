package day26_constructor;

public class StudentRunner {
    public static void main(String[] args) {

        Student ogrenci1 = new Student("Sena", "Yucedal", "02/12/1998", "001");
        System.out.println("Ogrenci1 Bilgileri: " + ogrenci1);

        System.out.println("");

        Student ogrenci2 = new Student("Beyza", "Kilic");
        System.out.println("Ogrenci2 Bilgileri: " + ogrenci2);
    }
}