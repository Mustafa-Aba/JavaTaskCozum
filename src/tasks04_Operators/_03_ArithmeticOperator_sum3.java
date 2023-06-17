package tasks04_Operators;

import java.util.Scanner;

public class _03_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

        /* Verilen 3 tane int (num1,num2,num3),
           Bu üç int'in toplamı yazdırın.   */


        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("3 tamsayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int toplam = num1 + num2 + num3;
        System.out.println("toplam = " + toplam);

    }
}
