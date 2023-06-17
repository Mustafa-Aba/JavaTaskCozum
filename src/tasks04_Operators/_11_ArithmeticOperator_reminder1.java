package tasks04_Operators;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */


        //Kodu aşağıya yazınız.


        Scanner input = new Scanner(System.in);
        System.out.println("iki tamsayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int kalan = num1 % num2;

        System.out.println("bölümden kalan: " + kalan);


    }
}
