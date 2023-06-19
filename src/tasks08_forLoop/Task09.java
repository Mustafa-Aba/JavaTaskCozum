package tasks08_forLoop;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */
        Scanner input=new Scanner(System.in);
        int sayi,toplam=0;;

        for (int i = 1; i <=5 ; i++) {
            System.out.print(i + ". sayı giriniz: ");
            sayi=input.nextInt();//5+6+7+8+0
            toplam+= (     sayi<10||sayi>20    )    ?    sayi   :   0;
        }
        System.out.println(toplam==0?"10 ile 20 arasında sayı yoktur."
                :"10 ile 20 arasında sayıların toplamı= "+ toplam);


    }
}
