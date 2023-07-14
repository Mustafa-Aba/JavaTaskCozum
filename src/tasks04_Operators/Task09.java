package tasks04_Operators;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("inek ve koyun toplam sayısını giriniz: ");
        int dortAyakli = input.nextInt();

        System.out.println("Tavuk sayısını giriniz: ");
        int ikiAyakli = input.nextInt();

        int toplam = dortAyakli * 4 + ikiAyakli * 2;
        System.out.println("Toplam ayak sayısı: "+toplam);
    }

}
