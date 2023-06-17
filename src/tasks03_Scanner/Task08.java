package tasks03_Scanner;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner input= new Scanner(System.in);

        System.out.print("vize1 notunuzu giriniz: ");
        int vize1= input.nextInt();

        System.out.print("vize2 notunuzu giriniz: ");
        int vize2= input.nextInt();


        System.out.print("final notunuzu giriniz: ");
        int finalnot= input.nextInt();

        double ort= ((vize1+vize2)/2.0)*0.3+finalnot*0.7;
        System.out.println("ort = " + ort);
    }
}
