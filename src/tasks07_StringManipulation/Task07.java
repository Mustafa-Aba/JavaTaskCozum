package tasks07_StringManipulation;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */


        Scanner input= new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");

        String str=input.nextLine();

        System.out.println("Hangi indexteki karakteteri istiyorsun: ");
        int index=input.nextInt();

        System.out.println("str.charAt(index) = " + str.charAt(index));
        System.out.println("str.substring(index,index+1) = " + str.substring(index, index + 2));
        System.out.println("str.substring(2) = " + str.substring(2));
    }
}
