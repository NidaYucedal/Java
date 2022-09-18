package day15_overloading_forLoop;

public class Test04_ForLoop {
    public static void main(String[] args) {

        /*
kullanicidan 100 den kucuk bir tamsayi isteyin,
1 den baslayarak girilen sayiya kadar 3 un kati olan sayilari yazdirin
 */


        for (int i = 1; i <=100; i++){
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
