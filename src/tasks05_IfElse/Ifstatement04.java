package tasks05_IfElse;

import java.util.Scanner;

public class Ifstatement04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 sayi 3 basamakli ise console ' a 3 basamakli yazdirin
		 sayi 2 basamakli ise console'a 2 basmakli yazdirin
		 sayi 3 basamakli yada 2 basamakli degilse ikiside degil yazdirin
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int sayi=input.nextInt();

		if ((sayi>99&&sayi<1000)||(sayi<-99 &&sayi>-1000)) {
			System.out.println("3 basamaklıdır.");
		} else if ((sayi>9&&sayi<100)||(sayi<-9 &&sayi>-100)) {
			System.out.println("2 basamaklıdır.");
		}else
			System.out.println("İkisi de değil.");


	}

}
