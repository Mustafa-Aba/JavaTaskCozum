package UcusProjesi;

import java.util.Scanner;

public class menu {
    static double ucret;

    public static void giris(){
        System.out.print("Hangi sehire gitmek istersiniz:  \t B\t C\t D");
        Scanner input = new Scanner(System.in);
        String sehir = input.next().toUpperCase();
        System.out.print("Yasınızı giriniz: ");
        int yas= input.nextInt();
        System.out.print("gidisdonus istiyorsanız ' E ' giriniz: ");
        char yon=input.next().toUpperCase().charAt(0);
        ucret=secim.sehirSec(sehir);
        ucret=secim.yasKontrol(yas);
        ucret=secim.gidisDonus(yon);
        secim.ucretYaz(ucret);

    }






}
