package tasks04_Operators;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /* Soru
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz: ");

        int sayi = input.nextInt();

        int ilkRakam = sayi / 100;
        int sonRakam = sayi % 10;
        int toplam = ilkRakam + sonRakam;
        System.out.println("toplam = " + toplam);


    }

}
