package tasks03_Scanner;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        Scanner input= new Scanner(System.in);
        System.out.print("Birinci dik kenar ölçüsünü gir: ");
        double a=input.nextDouble();
        System.out.println();
        System.out.print("ikinci dik kenar ölçüsünü gir: ");
        double b=input.nextDouble();
        double c=Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs= "+c );



    }
}
