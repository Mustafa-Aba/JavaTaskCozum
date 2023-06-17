package tasks05_IfElse;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf" yazdirin
		 Bu character kucuk harf ise "Kucuk Harf" yazdirin
		 Bu character harf degil ise "Harf Degil" yazdirin
		*/

		Scanner input=new Scanner(System.in);
		System.out.print("Bir character giriniz: ");
		char ch=input.next().charAt(0);

		if (ch>='A'&& ch<='Z') {
			System.out.println("Buyuk Harf");
		} else if (ch>='a'&& ch<='z') {
			System.out.println("Kucuk Harf");
		}else
			System.out.println("Harf Degil");


	}

}
