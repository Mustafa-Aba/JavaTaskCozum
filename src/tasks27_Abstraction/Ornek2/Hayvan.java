package tasks27_Abstraction.Ornek2;


import java.time.LocalDate;

public abstract class Hayvan {

    //id ,isim, vahsi(boolean),
    //   dogumTarihi (LocalDate) fieldları olan

    private int id;
    private String isim;
    private boolean vahsiMi;
    private LocalDate dogumTarihi=LocalDate.now();

    public Hayvan(int id, String isim, boolean vahsiMi, LocalDate dogumTarihi) {
        this.id = id;
        this.isim = isim;
        this.vahsiMi = vahsiMi;
        this.dogumTarihi = dogumTarihi;
    }

    public abstract void ses();
    public abstract void yemekMiktari();
    public abstract void gunlukUykuSuresi();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsiMi() {
        return vahsiMi;
    }

    public void setVahsiMi(boolean vahsiMi) {
        this.vahsiMi = vahsiMi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsiMi=" + vahsiMi +
                ", dogumTarihi=" + dogumTarihi ;
    }
}
