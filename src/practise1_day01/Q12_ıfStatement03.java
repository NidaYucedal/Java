package practise1_day01;

import java.util.Scanner;

public class Q12_ıfStatement03 {
    public static void main(String[] args) {
         /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("is unvaninizi giriniz");
        String unvan = scanner.nextLine();

        if (unvan.equals("qa")) {
            System.out.println("quality analyst");
        } else if (unvan.equals("dev")) {
            System.out.println("developer");
        } else if (unvan.equals("ba")) {
            System.out.println("business analyst");
        } else if (unvan.equals("pm")) {
            System.out.println("project manager");

        } else {
            System.out.println("gecersiz");
        }
    }
}
