package Tasks08_whileLoops;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner input=new Scanner(System.in);
        System.out.println("İki sayı giriniz: ");

        int sayi1= input.nextInt();
        int sayi2= input.nextInt();

        int i= Math.min(sayi1, sayi2)+1;
        while(i<Math.max(sayi1, sayi2)){
            System.out.print(i+" ");
            i++;
        }


    }
}
