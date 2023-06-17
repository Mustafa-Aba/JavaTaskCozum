package tasks05_IfElse;


import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

        Scanner input= new Scanner(System.in);
        System.out.print("Double bir sayı giriniz:");
        double sayi1= input.nextDouble();
        System.out.print("Double bir sayı giriniz:");
        double sayi2= input.nextDouble();
        if (sayi1>sayi2) {
            System.out.println("double 1 is greater than double 2");
        }else
            System.out.println("double 1 is smaller than double 2");



    }
}
