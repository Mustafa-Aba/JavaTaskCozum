package tasks03_Scanner;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

    /*    Bir int oluştur.
          Konsol'a arabanızdaki kapı sayısını girin.
          Bu int'i yazdırın.  */

        //Kodu aşağıya  yazınız.

        int kapiSayisi;
        Scanner input= new Scanner(System.in);
        System.out.println("arabanızdaki kapı sayısını girin:");
        kapiSayisi=input.nextInt();;
        System.out.println("kapiSayisi = " + kapiSayisi);


        int numOfDoor;

        System.out.println("Kapı sayısını giriniz: ");
        numOfDoor= input.nextInt();
        System.out.println("numOfDoor = " + numOfDoor);





    }
}


