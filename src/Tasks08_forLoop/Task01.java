package Tasks08_forLoop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */

        Scanner input = new Scanner(System.in);
        System.out.println("iki tam sayı giriniz: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();


       for (int i = Math.min(num1, num2); i < Math.max(num1, num2); i++) {
           System.out.print(i % 2 == 0 ? i + " " : "");
       }


        /*
          int min,max;

        if (num1<num2) {
            min=num1;
            max=num2;

        }else {
            min = num2;
            max = num1;
        }
        for (int i = min; i < max; i++) {
            System.out.print(i % 2 == 0 ? i + " " : "");
        }

         */

    }

}






















