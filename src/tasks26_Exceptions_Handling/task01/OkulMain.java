package tasks26_Exceptions_Handling.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OkulMain {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Okul okul = new Okul("Clarusway", 3);

        ogrenciEkle(okul);

    }

    static String tryCatchString() {

        String StringTypeInput;
        while (true) {
            try {
                StringTypeInput = input.nextLine();
                if (StringTypeInput.toLowerCase().matches("[a-zçğıüöş\\s]+")) {
                    break;
                } else {
                    throw new IllegalArgumentException("Giriş sadece harflerden oluşmalıdır. Tekrar giriş yapmalısınız.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return StringTypeInput;
    }

    private static void ogrenciEkle(Okul okul) {

        System.out.println("Öğrenci Ekle Sayfası");

        while (okul.getMaxOgrenciSayisi() > Okul.ogrenciler.size()) {

            System.out.print("Eklemek istediğiniz öğrencinin adı:");
            String ad = tryCatchString();


            System.out.print("Eklemek istediğiniz öğrencinin soyadı:");

            String soyad = tryCatchString();

            System.out.print("Eklemek istediğiniz öğrencinin yaşı:");
            int yas = 0;
            try {
                if (input.hasNextInt()) {
                    yas = input.nextInt();
                    input.nextLine();//dummmy
                    if (yas <= 15) {
                        Okul.ogrenciler.add(new Ogrenci(ad, soyad, yas));
                    } else {
                        throw new IllegalArgumentException("15 yaşından büyük öğrenci kaydı yapılamaz. Başka bir öğrenci girin.");
                    }
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Yas Hatalı Giriş: Yas rakamlardan oluşmalı");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Okul max seviyede olduğundan öğrenci eklenemez.");
        System.out.println("Ogrenciler = " + Okul.getOgrenciler());

    }


}


