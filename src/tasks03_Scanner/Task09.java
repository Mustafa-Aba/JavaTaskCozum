package tasks03_Scanner;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner input= new Scanner(System.in);
        int a,b,c;
        double sonuc;

        System.out.print("a sayısını giriniz: ");
        a=input.nextInt();
        System.out.print("b sayısını giriniz: ");
        b=input.nextInt();
        System.out.print("c sayısını giriniz: ");
        c=input.nextInt();
        sonuc=(a*a-b*b)/(c*3.0);
        System.out.println("sonuc = " + sonuc);


    }
}
