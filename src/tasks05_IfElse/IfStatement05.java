package tasks05_IfElse;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum�? yazdırın.
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl�? yazdırın.
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl�? yazdırın
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Bir yıl giriniz:");
		int year=input.nextInt();


		if (year%1000==0) {
			System.out.println("Milenyum");
		} else if (year%100==0) {
			System.out.println("Yüzyıl");
		} else if (year%10==0){
			System.out.println("Onyıl");
		}

	}
}

	

