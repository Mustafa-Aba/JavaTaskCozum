package tasks03_Scanner;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name and surname: ");
        String name=input.nextLine();
        System.out.println();
        System.out.print("Enter your age: ");
        int age=input.nextInt();
        System.out.println();
        System.out.print("Enter your weight: ");
        double weight=input.nextDouble();
        System.out.println();
        System.out.print("Enter your height: ");
        double height=input.nextDouble();
        System.out.println();
        System.out.print("Enter months: ");
        int months=input.nextInt();
        int payment= months*20;
        System.out.println("\t************\n"+"name = " + name+"\nage = " + age+"\nweight = " + weight+" kg\nheight ="+height+" cm");
        System.out.println("Total payment= "+payment+"$");

    }

}
