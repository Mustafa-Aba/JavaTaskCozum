package tasks03_Scanner;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=input.nextInt();
        System.out.println();
        System.out.print("Enter second number: ");
        int num2=input.nextInt();
        int add,subs,multiply;
        double divide;
        add=num1+num2;
        subs=num1-num2;
        multiply=num1*num2;
        divide=(double) num1/num2;

        System.out.println("num1 + num2 = " + add);
        System.out.println("num1 - num2 = " + subs);
        System.out.println("num1 * num2 = " + multiply);
        System.out.println("num1 / num2 = " + divide);


    }

}
