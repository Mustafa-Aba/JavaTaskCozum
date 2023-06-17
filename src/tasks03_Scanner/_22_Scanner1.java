package tasks03_Scanner;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        //Kodu aşağıya  yazınız.

        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        name=input.nextLine();

        System.out.println("İsminiz = " + name);

    }
}
