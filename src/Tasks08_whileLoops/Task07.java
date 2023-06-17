package Tasks08_whileLoops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create ediniz

        Scanner input = new Scanner(System.in);
        int i = 1, max = 0;
        while (i <= 5) {
            System.out.print(i + " . sayıyı giriniz:  ");
            int sayi = input.nextInt();
            max = Math.max(sayi, max);
            i++;
        }
        System.out.println("Girilen sayılar arasında enbüyük sayi: "+max);


    }
}
