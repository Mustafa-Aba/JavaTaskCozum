package tasks04_Operators;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /* Verilen iki int  (num1,  num2),
        İlk int'i ikinci int'e bölün.
        Sonucu yazdırın. */

        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);

        System.out.println("İki tamsayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        double division = (double) num1 / num2;

        System.out.println("division = " + division);


    }
}
