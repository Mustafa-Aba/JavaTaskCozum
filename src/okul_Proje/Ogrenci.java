package okul_Proje;

public class Ogrenci extends Kisi{

   private static int tempOgrenciNo =1000;
   private  int  ogrenciNo;
   private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo= tempOgrenciNo;
        tempOgrenciNo++;
        this.sinif = sinif;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }



    @Override
    public String toString() {

        return super.toString()+
                " ,\t ogrenciNo='" + ogrenciNo + '\'' +
                ", \t sinif='" + sinif + '\'' ;
    }
}
