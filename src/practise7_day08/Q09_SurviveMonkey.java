package practise7_day08;

public class Q09_SurviveMonkey {
    public static void main(String[] args) {


          /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;

		Adada yalnız bir maymun var
   Her gün 4 muz yemesi gerekiyor
   o adada sadece 165 muz var
    Aşağıdaki değişkenleri oluşturun ve kaç gün olduğunu bulun
   maymun hayatta kalabilir.
   Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
    int Muz Sayısı =165, hayatta kalmaDays = 1;
     boolean maymunAlive = true;
		*/


        int numberOfBananas = 165, survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            System.out.println("maymunlar gunde 4 muz yer");
            numberOfBananas -= 4; //toplam muzdan 4 azalir
            survivalDays++;//yasadigi gun sayisini 1 arttir

            if (numberOfBananas < 4) { //4 den az muz kalirsa
                monkeyAlive = false; //maymun hayatta degil
                System.out.println("bugun  " + survivalDays + " .gun muz kalmadi, maymun sizlere omur..:( ");
            } else
                System.out.println("bugun " + survivalDays + " gun, maymun halen hayatta..:) ");
        } while (monkeyAlive);
        
        System.out.println("toplam yasadigi gun sayisi : " + (survivalDays - 1));
    }
}

