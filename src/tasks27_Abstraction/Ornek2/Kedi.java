package tasks27_Abstraction.Ornek2;

import java.time.LocalDate;

public class Kedi extends Hayvan {


    public Kedi(int id, String isim, boolean vahsiMi, LocalDate dogumTarihi) {
        super(id, isim, vahsiMi, dogumTarihi);
    }

    @Override
    public String toString() {
        return "Kedi: " + super.toString();
    }

    @Override
    public void ses() {
        System.out.println("Kedi yine miyavladı");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("Bu kedi günde 200 gr yese kafi ");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("Ev kedisi çok uyur. Günlük 12 saat uykudadır");
    }
}
