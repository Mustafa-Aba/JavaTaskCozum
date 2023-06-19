package tasks10_Methods;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...// esitMi(int s1,int s2)

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        esitMi(sayi1, sayi2);


    }//main sonu

    private static void esitMi(int x, int y) {

        System.out.println((x == y) ? "Sayılar birbirine esit" : "Sayılar birbirine esit degil");
    }


}
