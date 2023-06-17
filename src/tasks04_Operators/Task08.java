package tasks04_Operators;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Saniye giriniz: ");
        int saniye = input.nextInt();

        int saat = saniye / 3600;

//1.yol
//        int dakika=(saniye-saat*3600)/60;
//        int kalanSaniye=saniye-(saat*3600+dakika*60);


//2.yol

        int dakika = (saniye % 3600) / 60;
        int kalanSaniye = (saniye % 3600) % 60;


        System.out.println(saat + " saat " + dakika + " dakika " + kalanSaniye + " saniye ");



    }
}
