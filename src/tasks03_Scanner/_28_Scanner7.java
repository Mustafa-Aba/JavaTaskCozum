package tasks03_Scanner;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        boolean control;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Banka Hesabınız Var mı ?(true or false)");
        control=input.hasNext();
        System.out.println("control = " + control);

    }
}
