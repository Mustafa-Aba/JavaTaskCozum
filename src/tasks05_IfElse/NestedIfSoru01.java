package tasks05_IfElse;

import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

		Scanner input=new Scanner(System.in);
		System.out.print("Cinsiyet giriniz: (Erkek icin: 'E' Kadın icin: 'K')");
		char cinsiyet=input.next().toUpperCase().charAt(0);


		System.out.print("Yasınızı giriniz:  ");
		int yas=input.nextInt();

		if (cinsiyet=='E') {
			if (yas<18) {
                System.out.println("Erkek çocuk");
            }
            else {
                System.out.println("Adam");
            }
		}
		else if (cinsiyet=='K') {
			if (yas<18) {
                System.out.println("Kız çocuk");
            }
            else {
                System.out.println("Kadın");
            }
		}else
			System.out.println("yanlış giriş yaptınız");


		
	}
}
