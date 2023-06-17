package tasks05_IfElse;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
“Eşkenar üçgen�? yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen�?
yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın�?
		 
		 */


		Scanner input=new Scanner(System.in);
		System.out.println("Birinci kenarı giriniz: ");
		int kenar1=input.nextInt();
		System.out.println("İkinci kenarı giriniz: ");
		int kenar2=input.nextInt();
		System.out.println("Üçüncü kenarı giriniz: ");
		int kenar3=input.nextInt();

		if (kenar1==kenar2&&kenar2==kenar3) {
			System.out.println("Eşkenar üçgen");
		} else if (kenar1==kenar2|| kenar1==kenar3||kenar2==kenar3) {
			System.out.println("Ikizkenar üçgen");

		}else
			System.out.println("Cesitkenar ucgen");

	}
	

}
