package tasks04_Operators;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        Scanner input = new Scanner(System.in);
        System.out.println("iki tamsayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 == num2);

    }
}