package tasks03_Scanner;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your height as cm:");
        double height=input.nextDouble();
        float by= input.nextFloat();
        System.out.println("Enter your weight as kg");
        double weight=input.nextInt();

        height = height*0.01;// Boy metre ye donusturuldu.
        double vke=weight/(height*height);
        System.out.println("Your vke = " + vke);
    }
}
