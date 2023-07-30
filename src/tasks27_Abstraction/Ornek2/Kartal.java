package tasks27_Abstraction.Ornek2;

import java.time.LocalDate;

public class Kartal extends Hayvan {

    public Kartal(int id, String isim, boolean vahsiMi, LocalDate dogumTarihi) {
        super(id, isim, vahsiMi, dogumTarihi);
    }

    @Override
    public String toString() {
        return "Kartal: " + super.toString();
    }

    @Override
    public void ses() {
        System.out.println("Kartalın kanat sesleri");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("Kartal günde 3 kg taze et tüketir.");

    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("Kartal günde 5 saat uyur.");

    }
}
