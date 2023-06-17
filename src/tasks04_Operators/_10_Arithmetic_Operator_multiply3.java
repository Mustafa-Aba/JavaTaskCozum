package tasks04_Operators;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */


        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("4 adet tamsayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int sonuc = num1 * num2 * num3 * num4;
        System.out.println("sonuc = " + sonuc);


    }
}
