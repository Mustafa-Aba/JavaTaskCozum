package tasks08_forLoop;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input=new Scanner(System.in);
        System.out.print("1'den büyük bir tam sayı giriniz: ");
        int toplam=0;
        for (int i = input.nextInt(); i >0 ; i--) {
            toplam+=Math.pow(i,2);
        }
        System.out.println("toplam = " + toplam);

    }
}
