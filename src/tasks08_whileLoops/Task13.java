package tasks08_whileLoops;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN"  x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Bir karakter giriniz: ");
            ch=scan.next().charAt(0);

           // if (ch=='x'){
           //     System.out.println("JAVATAR");
           //     continue;
           // }
            System.out.println("javaCAN");

        }while ((ch!='x'));


    }
}
