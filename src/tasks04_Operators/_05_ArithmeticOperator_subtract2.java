package tasks04_Operators;

import java.util.Scanner;

public class _05_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */


        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("4 adet tamsayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int fark = num1 - num2 - num3 - num4;

        System.out.println("fark = " + fark);


    }
}
