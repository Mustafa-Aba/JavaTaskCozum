package tasks10_Methods;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("Bir isim giriniz: ");
        String ad=input.nextLine().toLowerCase();
        System.out.print("Bir soyisim giriniz: ");
        String soyad=input.nextLine().toLowerCase();

        isimYaz(ad,soyad);

    }

    private static void isimYaz(String str1,String str2) {
        System.out.println(str1.substring(0, 1).toUpperCase().concat(str1.substring(1)).concat(" " + str2.substring(0, 1).toUpperCase().concat(str2.substring(1))));
    }


}
