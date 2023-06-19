package tasks08_whileLoops;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,                 ***Scanner
        // islemi bitirmek icin 0’a basmasini soyleyin.                         ***sayi!=0
        //	Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin *** continue;
        //	ve  yazdirip basa donun                                             ***loop
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,         ///sayacPozitif
        //	yanlislikla kac negative sayi girdigini                         /// sayacNegatif
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.      ***toplam

        pozitifTopla();

    }

    private static void pozitifTopla() {
        Scanner input = new Scanner(System.in);
        System.out.println("Toplamak istediğiniz pozitif sayiları giriniz: ");
        int sayi = input.nextInt();


        int toplam = 0, sayacPozitif = 0, sayacNegatif = 0;
        while (sayi != 0) {
            System.out.println("İslemi bitirmek istediğinizde 0’a basın!");
            if (sayi > 0) {
                toplam += sayi;
                sayacPozitif++;
            } else {
                System.out.println("Negatif sayi giremezsiniz");
                sayacNegatif++;

            }
            sayi = input.nextInt();
        }
        System.out.println(sayacNegatif + " adet Negatif sayı girdiniz.");
        System.out.println(sayacPozitif + " adet Pozitif sayı girdiniz.");
        System.out.println("toplam = " + toplam);
    }
}
