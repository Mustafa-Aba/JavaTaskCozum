package tasks04_Operators;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Üç tane ondalıklı sayı giirniz: ");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        double sayi3 = input.nextDouble();
        double sayi4 = input.nextDouble();

        double carpim = sayi1 * sayi2 * sayi3 * sayi4;

        System.out.println("carpim = " + carpim);


    }
}
