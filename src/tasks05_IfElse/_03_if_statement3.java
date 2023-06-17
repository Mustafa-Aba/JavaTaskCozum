package tasks05_IfElse;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        Scanner input=new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");
        String str1=input.nextLine();

        System.out.println("Bir metin giriniz: ");
        String str2=input.nextLine();

        if (str1.equals(str2)) {
            System.out.println("String 1 is equal to String 2");
        } else {
            System.out.println("String 1 is NOT equal to String 2");
        }



    }
}
