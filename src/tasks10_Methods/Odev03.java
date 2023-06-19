package tasks10_Methods;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false   //boolean

     * */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1 = input.nextInt();



        System.out.println((getAsalMi(sayi1))? sayi1 + " sayısı asal" : sayi1 + " sayısı asal değil");
    }

    private static boolean getAsalMi(int number) {
        boolean asal = true;
        if (number >= 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0 ) {
                    asal = false;
                    break;
                }
            }
        }else {
            System.out.println("Sayı sıfırdan büyük olmalı");
            asal=false;
        }
        return asal;
    }
}
