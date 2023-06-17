package tasks03_Scanner;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.

        String birthday;

        Scanner input=new Scanner(System.in);
        System.out.println("Doğum gününüzü giriniz: ");
        birthday=input.nextLine();

        System.out.println("birthday = " + birthday);


    }
}
