import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    String marka;
    String model;
    int km;
    double motorHacmi;
    boolean vitesAuto;
    boolean ikiciEl;
    int yil;
    String tramer;

    @Override
    public String toString() {
        return "Main{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikiciEl=" + ikiciEl +
                ", yil=" + yil +
                ", tramer='" + tramer + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Main arac1=new Main();
        arac1.km=215000;
        arac1.ikiciEl=true;
        arac1.marka="FIAT";
        arac1.model="Uno 70sx";
        arac1.motorHacmi=1400;
        arac1.tramer="3 kaza";
        arac1.yil=2000;
        arac1.vitesAuto=false;


       // System.out.println("arac1 = " + arac1.toString());
        System.out.println("arac1 = " + arac1);

    }
}