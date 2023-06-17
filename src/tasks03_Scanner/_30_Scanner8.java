package tasks03_Scanner;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        byte kg;

        Scanner input = new Scanner(System.in);
        System.out.println("kg cinsinden bir ağırlık girniz: ");
        kg= input.nextByte();
        System.out.println("kg = " + kg);


    }
}
