package tasks05_IfElse;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      int number oluşturulmuştur.
                Eğer int number 0 ise  "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner input = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi == 0) {
            System.out.println("Im neutral");
        } else if (sayi > 0) {
            System.out.println("I m positive");
        } else {
            System.out.println("I am negative");
        }


    }
}
