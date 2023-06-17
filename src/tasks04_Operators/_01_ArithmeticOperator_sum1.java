package tasks04_Operators;


import java.util.Scanner;

public class _01_ArithmeticOperator_sum1 {

    public static void main(String[] args) {

    /*    Verilen iki tane int  (num1 , num2),
        Bu iki Integer'in toplamını yazdırın. */


        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("İki tamsayı girniz: ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Girilen sayıların toplamı = " + toplam);


    }
}
