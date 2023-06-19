package tasks08_whileLoops;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		 do-While loop
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scan.nextLine();
        int index = 0;

        int harfSay = 0, charSay = 0, rakamSay = 0;

        do {
            if (metin.length() == 0) {
                System.out.println("Metin boş olamaz!");
            } else {
                String str = metin.substring(index,index+1);
                if (str.matches("[A-Z:a-z]")) {
                    harfSay++;
                } else if (str.matches("[0-9]")) {
                    rakamSay++;
                } else
                    charSay++;
            }

          //2.yol Character wrapper class
          // if (metin.isEmpty()) {
          //     System.out.println("Metin boş olamaz!");
          // }else {
          //     if (Character.isLetter(metin.charAt(index))) {
          //         harfSay++;
          //     } else if (Character.isDigit(metin.charAt(index))) {
          //         rakamSay++;
          //     } else
          //         charSay++;
          // }



            index++;
        } while (metin.length() > index);

        System.out.println("harfSayısı = " + harfSay);
        System.out.println("rakamSayısı = " + rakamSay);
        System.out.println("charSayısı = " + charSay);


    }

}
