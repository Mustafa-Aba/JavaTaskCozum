package tasks04_Operators;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */


        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Üç tane ondalıklı sayı giirniz: ");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        double sayi3 = input.nextDouble();

        double carpim = sayi1 * sayi2 * sayi3;

        System.out.println("carpim = " + carpim);


    }
}
