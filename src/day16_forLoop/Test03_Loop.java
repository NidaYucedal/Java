package day16_forLoop;

public class Test03_Loop {
    public static void main(String[] args) {

        //kullanicidan bir string isteyin girilen string palindrome
        //olup olmadığını yazdırın

        int palindrom=454; //palindrome tersten yazılınca ayni olan sayi
        int ilkdeger = palindrom;
        int length = String.valueOf(palindrom).length();

        int kalan,deger=0;
        for (int i = 0; i<length; i++){

            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom /10;
        }

        if(deger == ilkdeger){
            System.out.println(deger + " Palindrom Sayidir.");
        }else{
            System.out.println(deger + " Palindrom Sayi Degildir.");
        }

    }
}