package lambda_functional_programming01;

public class Courses {
    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;


    public Courses() {
    }


    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }


    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course: Season=" + Season + ", courseName=" + courseName + ", averageScore=" + averageScore
                + ", numberOfStudents=" + numberOfStudents;
    }

    // stream() ==> collection'dan elementleri dahil etmek için ve methodlara ulaşmak için kullanilir.
//filter(t ->t%2==0)===>if(t%2==0) ile ayni islem
//map(t->t*t)==>t'leri t*t 'ler le degistirir
//distinct()==> tekrarsiz olan elemanlari alir
//reduce(0,(t,u)->t+u)==>t=0 baslangic degerini alir ona u lari ekler
//Comparator.reverseOrder()==>terstern siralam yapar[String'de olmaz ama StringBuilder'da kullanilir]
//findFirst().get()==> bu ikisi birlikte kullanilir ve ilk elemani verir.
//Math::addExact==>toplama yapar
//Integer::sum==>toplama yapar
//Math::multiplyExact ==> elemanlarin carpimini yapar
//sorted(Comparator.reverseOrder()) ==> Buyukten kucuge siralama yapar
//sorted() ==> kucukten buyuge siralama yapar
// collect(Collectors.toList()) ==>Elamanları collection'a çevirir.
//Comparator.comparing(...):==>...siralama kosulunu belirtmek icin kullanilir.[sorted(Comparator.comparing(String::length))==> uzunkuga gore]
// reversed()==> ters cevirir
//thenComparing() :==>siralama icin bir kosul daha belirtir [sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakterAl)).]
//removeIf(sart)==> sart saglaniyorsa siler [removeIf(t->t.length()>5)] ==>5'ten buyuk ise sil
//allMatch==>tum elemanlar istenen kosula uyar mi?
//noneMatch==> hic bir eleman istenen kosula uyar mi?
//anyMatch ==>  herhangibir  eleman istenen kosula uyar mi?
//IntStream==> integer bir stream olusturur ve method'larini kullaniriz
//.range(7,101)==> 101 dahil degil[7+8+9...+100]
//.rangeClosed(7,100)==> 100 dahil [7+8+9...+100]
//.sum()==> toplama yapar[ range() methoduna bagli calisir]
//getAsInt() ==> sonucu integer olarak alir
//max(listelenen eleman ozellikleri)==> istenen en buyuk degerli elemani alir
//skip(int x)==> x kadar elemani atlar
}
