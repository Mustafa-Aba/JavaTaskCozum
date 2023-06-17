package tasks04_Operators;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*    Verilen 2 tane int (num1, num2),
        Int'lerin farkını yazdırın. */


        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);

        System.out.println("İki tamsayı giiriniz: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int fark = num1 - num2;
        System.out.println("İki sayının farkı = " + fark);


    }
}
