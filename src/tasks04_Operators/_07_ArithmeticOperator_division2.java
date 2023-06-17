package tasks04_Operators;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */


        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("iki tamsayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sonuc = num1 / num2;

        System.out.println("sonuc = " + sonuc);


    }
}
