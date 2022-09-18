package day02_variables;

public class Test_01 {
    public static void main(String[] args) {
        int s1=10;
        int s2=20;
        int temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("swaptan sonra s1:"+ s1 + ", s2:" + s2 );


        int a=40;
        int b=50;
        int tem=a;
        a=b;
        b=tem;
        System.out.println("a:" + a + ", b:" + b);


        int x=30;
        int y=20;
        int te=x;
        x=y;
        y=te;
        System.out.println("x:"+ x +", y:"+ y);
    }
}
