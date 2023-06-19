package tasks10_Methods;

import java.util.Scanner;

public class Task06 {
    static Scanner sc = new Scanner(System.in);
    static int kenar1, kenar2;

    public static void main(String[] args) {
		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	 */


        geometrikSecim();

    }

    private static void geometrikSecim() {
        System.out.print("Geometrik seçiminizin ismini giriniz: (kare, dikdortgen ve ucgen) ");
        String sekil = sc.nextLine().toLowerCase();
        getSayi(sekil);

        switch (sekil) {
            case "kare":
                kare(kenar1);
                break;
            case "dikdortgen":
                dikdortgen(kenar1, kenar2);
                break;
            case "ucgen":
                ucgen(kenar1, kenar2);
                break;
            default:
                System.out.println("Yanlış giriş yaptınız. Tekrar deneyiniz.");
                geometrikSecim();
        }
    }

    private static void ucgen(int a, int b) {
        System.out.print("Üçüncü kenarı giriniz: ");
        int c = sc.nextInt();
        System.out.println("Üçgenin çevresi= " + (a + b + c));
        System.out.println("Üçgenin alanı= " + (a * b) / 2);
    }

    private static void dikdortgen(int a, int b) {
        System.out.println("Dikdörtgenin çevresi= " + 2 * (a + b));
        System.out.println("Dikdörtgenin alanı= " + (a * b));
    }

    private static void kare(int a) {
        System.out.println("Karenin çevresi= " + (4 * a));
        System.out.println("Karenin alanı= " + (a * a));
    }

    private static void getSayi(String str) {
        if (str.equals("kare")) {
            System.out.print("Kenarı giriniz: ");
            kenar1 = sc.nextInt();
        } else {
            System.out.print("Birinci kenarı giriniz: ");
            kenar1 = sc.nextInt();
            System.out.print("İkinci kenarı giriniz: ");
            kenar2 = sc.nextInt();
        }
    }

}


