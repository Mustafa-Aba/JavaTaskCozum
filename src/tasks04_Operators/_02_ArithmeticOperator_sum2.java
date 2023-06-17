package tasks04_Operators;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*   Verilen 4 tane int vardır.
        Int'lerin toplamlarını yazdırın  */


        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("4 adet tamsayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int toplam = num1 + num2 + num3 + num4;

        System.out.println("toplam = " + toplam);

    }
}
