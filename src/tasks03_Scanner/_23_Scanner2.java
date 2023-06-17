package tasks03_Scanner;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

    /*    Bir int oluşturun.
          Konsol'a herhangi bir sayı giriniz.
          Bu sayıyı yazdırın.   */

        //Kodu aşağıya  yazınız.

        int sayi;

        Scanner input= new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi=input.nextInt();
        System.out.println("sayi = " + sayi);


    }
}
