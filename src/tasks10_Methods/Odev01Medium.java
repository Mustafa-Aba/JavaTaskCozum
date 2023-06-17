package tasks10_Methods;

import java.util.Scanner;

public class Odev01Medium {
    /*
    Ismi randomNum() olan bir method oluşturun.
    Parametre olarak (int max) almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.//Math.random()*max;
    Random numarayı döndürünüz.//return
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        System.out.println(randomNum(sayi));
    }

    private static int randomNum(int max) {
        return (int) (Math.random() * max);
    }

}
