package tasks10_Methods;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        int year= input.nextInt();
        System.out.println(artikYil(year));


    }

    private static boolean artikYil(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        //return (year%4==0 && year%100!=0 ) || (year%100==0 && year%400==0);
    }


}
