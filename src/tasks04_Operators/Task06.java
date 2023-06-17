package tasks04_Operators;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        Scanner input = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz : ");

        int sayi = input.nextInt();


        int birler = sayi % 10;
        int onlar = (sayi/10) % 10;
        int yuzler = sayi / 100;

        System.out.println("birler basamagi :"+birler+"\nonlar basamagi : "+onlar+"\nyuzler basamagi :"+yuzler);


    }
}
