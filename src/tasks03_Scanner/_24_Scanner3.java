package tasks03_Scanner;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.
        String meyve;
        Scanner input= new Scanner(System.in);
        System.out.print("Sevdiğiniz bir meyveyi yazın: ");
        meyve=input.nextLine();
        System.out.println("meyve = " + meyve);

    }
}
