package tasks05_IfElse;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise
          kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */
        Scanner input= new Scanner(System.in);
        System.out.print("Ehliyet var mıdır?(Varsa true yoksa false giriniz: )");
        boolean isValid=input.nextBoolean();
        System.out.print("Kaç yıl tecrubeniz var: ");
        int yil=input.nextInt();
        System.out.print("Toplam aldığınız mesafe kaç km: ");
        int km=input.nextInt();

        if (isValid) {
            if (yil>=7) {
                if (km>=100000) {
                    System.out.println("Kontak anahtar sizindir.");
                }else {
                    System.out.println("Mesafe yeterli degil . 100000 km aşılmalıdır.");
                }
            }else{
                System.out.println( "Tecrube yili yeterli degil. 7 yil tecrube gereklidir.");
            }

        }else{
            System.out.println("Ehliyet olmadan anahtar verilmez.");

        }



    }
}
