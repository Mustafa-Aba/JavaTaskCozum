package tasks05_IfElse;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
         /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */

     //  x = str(input("taş,kağıt,makas")).lower()
     //  y = str(input("taş,kağıt,makas")).lower()

     //  if x == y :
     //  print("berabere")
     //  else if x == "taş" and y== "kağıt":
     //  print("kazanan:y")
     //  else if x == "kağıt" and y == "taş":
     //  print("kazanan: x")
     //  else if x == "makas" and y=="kağıt":
     //  print("kazanan: x")
     //  else if y == "makas" and x== "kağıt":
     //  print("kazanan: y")
     //  else if y== "makas" and x=="taş":
     //  print("kazanan: x")
     //   else
     //  print("sizden istenen ifadelerden birini giriniz")

        Scanner input=new Scanner(System.in);

        System.out.println("***Birinci Oyuncu İşlem Seciniz:***\nTas : 'T'\nKagıt: 'K'\nMakas: 'M'");
        char gamer1=input.next().toLowerCase().charAt(0);
        System.out.println("***İkinci Oyuncu İşlem Seciniz:***\nTas : 'T'\nKagıt: 'K'\nMakas: 'M'");
        char gamer2=input.next().toLowerCase().charAt(0);

        if (gamer1!=gamer2) {
            if ((gamer1=='t' && gamer2=='m')||(gamer1=='k' && gamer2=='t') ||(gamer1=='m' && gamer2=='k') ) {
                System.out.println("Birinci oyuncu kazanır.Tebrikler");
            }else
                System.out.println("İkinci oyuncu kazanır.Tebrikler");

        }else
            System.out.println("Berabere bitti.");






    }
}
