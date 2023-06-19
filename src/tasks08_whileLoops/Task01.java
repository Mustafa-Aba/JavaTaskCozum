package tasks08_whileLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner input=new Scanner(System.in);
        int sayi,sayac=0,toplam=0;

        while(toplam<=333){
            System.out.println("Bir sayı giriniz:");
            sayi= input.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println("Girilen sayı adeti = " + sayac);
        System.out.println("Girilen sayıların toplamı = " + toplam);


    }
}
