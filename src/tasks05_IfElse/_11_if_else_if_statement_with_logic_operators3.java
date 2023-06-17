package tasks05_IfElse;

import java.util.Scanner;

public class _11_if_else_if_statement_with_logic_operators3 {

    public static void main(String[] args) {

    /*  Eğer String null (0) değilse ve String uzunluğu 14 ise ve String "i love java" yı kapsıyorsa
        "String is i love java and 14 character." yazdırınız.

        Eğer String null(0) değilse ve karakter biçimini (büyük, kücük harf) görmezden gelirse,
        "String is I love java" yazdırın. */

        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String metin=input.nextLine();

        if (!(metin.equals(null)) && metin.length()==14 && metin.contains("i love java")) {
            System.out.println("String is i love java and 14 character.");
        } else if (!(metin.equals(null))&& metin.equalsIgnoreCase(metin)) {

            System.out.println("String is I love java");
        }


    }
}
