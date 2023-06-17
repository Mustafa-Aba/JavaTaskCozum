package tasks03_Scanner;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Task->
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner input = new Scanner(System .in);
        System.out.print("Mesafeyi giriniz: ");
        int m=input.nextInt();
        System.out.println();
        System.out.print("Hızınızı giriniz: ");
        int v=input.nextInt();
        int t=m/v;
        System.out.println("süre = " + t);
    }
}
