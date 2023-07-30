package tasks27_Abstraction.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Hayvan kedi = new Kedi(111, "kedicik", false, LocalDate.of(2023,06,06));
        Hayvan kartal = new Kartal(222, "Giant Kartal", true, LocalDate.of(2023,01,01));

        System.out.println(kedi);
        kedi.ses();kedi.yemekMiktari();kedi.gunlukUykuSuresi();
        System.out.println();
        System.out.println(kartal);
        kartal.ses();kartal.yemekMiktari();kartal.gunlukUykuSuresi();


    }
}
